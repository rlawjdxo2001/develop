package jp.co.developNoticeBoard.action.cmn000;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * [cmnChkPreProcessのアクションクラス]<br>
 * <br>
 * @author jungtae1.kim
 */
public class CmnChkPreProcess extends AbstractInterceptor{

    /* ロガー */
    private Logger logger = LogManager.getLogger(CmnChkPreProcess.class);


	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		logger.info("----------------start {}.{}----------------", "cmnChkPreProcess", "intercept");

		//セッション情報の有無をチェックする。
		if(chkSession(invocation)) {
			return "goLogin";
		}

		logger.info("---------------- end {}.{} ----------------", "cmnChkPreProcess", "intercept");
		return invocation.invoke();
	}

	private boolean chkSession(ActionInvocation invocation) {
		logger.info("----------------start {}.{}----------------", "cmnChkPreProcess", "chkSession");
		//セッション情報を取得する。
		Map<String, Object> session = invocation.getInvocationContext().getSession();
		if (session.get("userSession") == null) {
			logger.info("セッション情報がありません、ログイン画面に戻ります。");
			logger.info("---------------- end {}.{} ----------------", "cmnChkPreProcess", "chkSession");
			return true;
		} else {
			logger.info("---------------- end {}.{} ----------------", "cmnChkPreProcess", "chkSession");
			return false;
		}
	}
}
