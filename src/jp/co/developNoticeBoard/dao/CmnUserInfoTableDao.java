package jp.co.developNoticeBoard.dao;

import java.sql.SQLException;

import jp.co.developNoticeBoard.dto.CmnUserInfoTableDto;
import jp.co.developNoticeBoard.util.SqlMapLocator;

/**
 * CMN_USER_INFO_TABLEのDAO
 * @author Kim.jungtae
 *
 */
public class CmnUserInfoTableDao {

	public CmnUserInfoTableDto getUserInfoInfo(CmnUserInfoTableDto parameterValues) throws SQLException{
		return (CmnUserInfoTableDto)SqlMapLocator.getMapper().queryForObject("getCmnUserInfoTable", parameterValues);
	}
}
