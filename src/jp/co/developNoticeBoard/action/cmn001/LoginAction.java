package jp.co.developNoticeBoard.action.cmn001;

import java.sql.SQLException;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;

import jp.co.developNoticeBoard.dao.CmnUserTableDao;
import jp.co.developNoticeBoard.dto.CmnUserTableDto;

/**
 * [loginActionのアクションクラス]<br>
 * <br>
 * @author jungtae1.kim
 */
public class LoginAction {

    /* ロガー */
    private Logger logger = LogManager.getLogger(LoginAction.class);

    private String userId;
    private String userPassword;


    /**
     * [アクション実行処理]<br>
     * @return
     */
    public String execute() {
        return "success";
    }


    /**
     * [アクション実行処理]<br>
     * @return
     */
    public String login() {

    	logger.info("----------------start {}.{}----------------", "loginAction", "execute");

    	if(chkLogin()) {
    		logger.info("---------------- end {}.{} ----------------", "loginAction", "execute");
    		return "success";
    	} else {
    		logger.info("---------------- end {}.{} ----------------", "loginAction", "execute");
    		return "ngProcess";
    	}
    }

    private boolean chkLogin() {
    	logger.info("----------------start {}.{}----------------", "loginAction", "chkLogin");
    	CmnUserTableDto loginInfo = null;
    	CmnUserTableDao dao = new CmnUserTableDao();
    	try {
    		loginInfo = dao.getLoginInfo(setLoginCondi());

    		ActionContext context = ActionContext.getContext();
    		Map<String, Object> userInfo = context.getSession();

    		userInfo.put("userSession", loginInfo);

    		context.setSession(userInfo);
    	} catch (SQLException e) {
    		logger.error(e);
    		e.getStackTrace();
		}

    	if (loginInfo == null) {
    		logger.info("ログイン情報取得に失敗しました。※ID：{}", getUserId());
    		logger.info("---------------- end {}.{} ----------------", "loginAction", "chkLogin");
    		return false;
    	} else {
    		logger.info("ログイン成功！※ID：{}", getUserId());
    		logger.info("---------------- end {}.{} ----------------", "loginAction", "chkLogin");
    		return true;
    	}
    }

    private CmnUserTableDto setLoginCondi() {
    	CmnUserTableDto searchCondi = new CmnUserTableDto();
    	searchCondi.setUserId(getUserId());
    	searchCondi.setPassword(getUserPassword());
    	return searchCondi;
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


}
