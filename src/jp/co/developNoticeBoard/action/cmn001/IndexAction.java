package jp.co.developNoticeBoard.action.cmn001;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * [IndexActionのアクションクラス]<br>
 * <br>
 * @author jungtae1.kim
 */
public class IndexAction {

    /* ロガー */
    private Logger logger = LogManager.getLogger(IndexAction.class);

    /**
     * [アクション実行処理]<br>
     * @return
     */
    public String execute() {
        return "success";
    }


}
