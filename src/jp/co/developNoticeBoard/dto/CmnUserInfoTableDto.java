package jp.co.developNoticeBoard.dto;

import java.sql.Date;

/**
 * CMN_USER_INFO_TABLEのDTO
 * @author Kim.jungtae
 */
public class CmnUserInfoTableDto {

	//ユーザSEQ
	private int userSeq;
	//ユーザ姓
	private String userFirstName;
	//ユーザ名
	private String userLastName;
	//ユーザメール
	private String userEmail;
	//ユーザ携帯番号
	private String userPhoneNumber;
	//ユーザ住所１
	private String userAddress1;
	//ユーザ住所２
	private String userAddress2;
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


	public CmnUserInfoTableDto() {
		super();
	}

	public CmnUserInfoTableDto(int userSeq) {
		super();
		this.userSeq = userSeq;
		this.userFirstName = "";
		this.userLastName = "";
		this.userEmail = "";
		this.userPhoneNumber = "";
		this.userAddress1 = "";
		this.userAddress2 = "";
		this.createUser = "";
		this.createDt = null;
		this.modiUser = "";
		this.modiDt = null;
		this.modiProgram = "";
	}

	public CmnUserInfoTableDto(int userSeq, String userFirstName, String userLastName, String userEmail,
			String userPhoneNumber, String userAddress1, String userAddress2, String createUser, Date createDt,
			String modiUser, Date modiDt, String modiProgram) {
		super();
		this.userSeq = userSeq;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userPhoneNumber = userPhoneNumber;
		this.userAddress1 = userAddress1;
		this.userAddress2 = userAddress2;
		this.createUser = createUser;
		this.createDt = createDt;
		this.modiUser = modiUser;
		this.modiDt = modiDt;
		this.modiProgram = modiProgram;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserAddress1() {
		return userAddress1;
	}

	public void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}

	public String getUserAddress2() {
		return userAddress2;
	}

	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
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
