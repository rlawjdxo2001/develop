package jp.co.developNoticeBoard.util;

import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

/**
 * マッパー取得ユーティリティ
 * @author Kim.jungtae
 *
 */
public class SqlMapLocator {

	public static SqlMapClient getMapper() {
		SqlMapClient sqlMapper = null;

		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");

			sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);

			reader.close();

		} catch (IOException e) {
			throw new RuntimeException("sqlMapperの処理途中でエラーが発生しました。", e);
		}

		return sqlMapper;
	}
}
