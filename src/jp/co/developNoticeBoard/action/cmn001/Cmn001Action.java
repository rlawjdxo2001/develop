package jp.co.developNoticeBoard.action.cmn001;

import java.sql.SQLException;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionContext;

import jp.co.developNoticeBoard.dao.CmnUserInfoTableDao;
import jp.co.developNoticeBoard.dao.CmnUserTableDao;
import jp.co.developNoticeBoard.dto.CmnUserInfoTableDto;
import jp.co.developNoticeBoard.dto.CmnUserTableDto;
import jp.co.developNoticeBoard.vo.UserInfoVo;

/**
 * ログイン関連画面のアクションクラス
 * @author jungtae1.kim
 */
public class Cmn001Action {

    /* ロガー */
    private Logger logger = LogManager.getLogger(Cmn001Action.class);

    private String userId = "";
    private String userPassword = "";
    private String errMessage;


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

    /**
     * 入力されたIDとパスワードに対するユーザー情報を取得する。
     * @return true:ログイン成功、false:ログイン失敗
     */
    private boolean chkLogin() {
    	logger.info("----------------start {}.{}----------------", "loginAction", "chkLogin");
    	CmnUserTableDto loginInfo = null;
    	UserInfoVo userinfoVo = null;
    	//ログイン情報DAO
    	CmnUserTableDao userDao = new CmnUserTableDao();
    	//ユーザ情報DAO
    	CmnUserInfoTableDao userInfoDao = new CmnUserInfoTableDao();
    	try {
    		loginInfo = userDao.getLoginInfo(setLoginCondi());

    		if (loginInfo != null) {
    			userinfoVo =  new UserInfoVo(loginInfo.getUserSeq());
    			//取得したSEQでユーザ情報を取得する。
    			CmnUserInfoTableDto userinfoTableDto
    			= userInfoDao.getUserInfoInfo(new CmnUserInfoTableDto(loginInfo.getUserSeq()));

    			if (userinfoTableDto != null) {
    				userinfoVo = setUserInfo(userinfoTableDto);
    			}

    		}
    		ActionContext context = ActionContext.getContext();
    		Map<String, Object> userInfo = context.getSession();

    		userInfo.put("userSession", userinfoVo);

    		context.setSession(userInfo);
    	} catch (SQLException e) {
    		logger.error(e);
    		e.getStackTrace();
		}

    	if (loginInfo == null) {
    		setErrMessage("IDまたはパスワードが正しくありません。");
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

    private UserInfoVo setUserInfo(CmnUserInfoTableDto dbValue) {
    	UserInfoVo returnValue = new UserInfoVo();

    	returnValue.setUserSeq(dbValue.getUserSeq());
    	returnValue.setUserFirstName(dbValue.getUserFirstName());
    	returnValue.setUserLastName(dbValue.getUserLastName());
    	returnValue.setUserEmail(dbValue.getUserEmail());
    	returnValue.setUserPhoneNumber(dbValue.getUserPhoneNumber());
    	returnValue.setUserAddress1(dbValue.getUserAddress1());
    	returnValue.setUserAddress2(dbValue.getUserAddress2());

    	return returnValue;
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

	public String getErrMessage() {
		return errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}


}
