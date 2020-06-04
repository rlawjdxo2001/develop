package jp.co.developNoticeBoard.dto;

import java.sql.Date;

/**
 * CMN_USER_TABLE用のDTO
 * @author Kim.jungtae
 *
 */
public class CmnUserTableDto {

	//ユーザSEQ
    private int userSeq;
    //ユーザID
    private String userId;
    //ユーザパスワード
    private String password;
    //登録者ID
    private String createUser;
    //登録日時
    private Date createDt;
    //更新者ID
    private String modiUser;
    //更新日時
    private Date modiDt;
    //更新プログラム
    private String modiProgram;
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public String getModiUser() {
		return modiUser;
	}
	public void setModiUser(String modiUser) {
		this.modiUser = modiUser;
	}
	public Date getModiDt() {
		return modiDt;
	}
	public void setModiDt(Date modiDt) {
		this.modiDt = modiDt;
	}
	public String getModiProgram() {
		return modiProgram;
	}
	public void setModiProgram(String modiProgram) {
		this.modiProgram = modiProgram;
	}


}
