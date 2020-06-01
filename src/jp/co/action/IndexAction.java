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
     * HelloWorldを出力する処理を実行する。<br>
     * 実行するメソッドは、struts.xmlで指定したメソッド名を使用して実装する。<br>
     * Struts2ではアクションの処理結果でページの遷移先を決定するが、
     * 今回は"success"の固定文字列を返却する。<br>
     * <br>
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
