package jp.co.developNoticeBoard.vo;

/**
 * ユーザー情報VO
 * @author Kim.jungtae
 */
public class UserInfoVo {

	private int userSeq;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userPhoneNumber;
	private String userAddress1;
	private String userAddress2;


	public UserInfoVo() {
		super();
	}


	public UserInfoVo(int userSeq) {
		super();
		this.userSeq = userSeq;
		this.userFirstName = "";
		this.userLastName = "";
		this.userEmail = "";
		this.userPhoneNumber = "";
		this.userAddress1 = "";
		this.userAddress2 = "";
	}


	public UserInfoVo(int userSeq, String userFirstName, String userLastName, String userEmail, String userPhoneNumber,
			String userAddress1, String userAddress2) {
		super();
		this.userSeq = userSeq;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.userPhoneNumber = userPhoneNumber;
		this.userAddress1 = userAddress1;
		this.userAddress2 = userAddress2;
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

}
