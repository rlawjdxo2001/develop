package jp.co.developNoticeBoard.action.brd001;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Brd001Action {

    /* ロガー */
    private Logger logger = LogManager.getLogger(Brd001Action.class);

	public String execute() {
    	logger.info("----------------start {}.{}----------------", "Brd001Action", "execute");
    	logger.info("---------------- end {}.{} ----------------", "Brd001Action", "execute");
		return "success";
	}
}
