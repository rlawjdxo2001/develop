package jp.co.action.cmn002;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * [loginActionのアクションクラス]<br>
 * <br>
 * @author jungtae1.kim
 */
public class LoginAction {

    /* ロガー */
    private Logger logger = LogManager.getLogger(LoginAction.class);

    /**
     * [アクション実行処理]<br>
     * @return
     */
    public String execute() {

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
    	return false;
    }
}
