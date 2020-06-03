package jp.co.developNoticeBoard.dao;

import java.sql.SQLException;

import jp.co.developNoticeBoard.dto.CmnUserTableDto;
import jp.co.developNoticeBoard.util.SqlMapLocator;

public class CmnUserTableDao {

	public CmnUserTableDto getLoginInfo(CmnUserTableDto parameterValues) throws SQLException{
		return (CmnUserTableDto)SqlMapLocator.getMapper().queryForObject("getCmnUserTable", parameterValues);
	}
}
