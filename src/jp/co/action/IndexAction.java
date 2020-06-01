package jp.co.action;

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

    private String name;

    /**
     * [アクション実行処理]<br>
     * @return
     */
    public String execute() {
        logger.info("入力されたパラメータは「{}」です。", name);
        return "success";
    }



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
