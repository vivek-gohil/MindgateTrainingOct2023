package com.mindgate.main.domain;

public class LoginDetails {
	private int loginId;
	private String password;
	private String userName;
	private String role;
	private int loginCount;
	private boolean loginStatus;

	public LoginDetails() {
		// TODO Auto-generated constructor stub
	}

	public LoginDetails(int loginId, String password, String userName, String role, int loginCount,
			boolean loginStatus) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.userName = userName;
		this.role = role;
		this.loginCount = loginCount;
		this.loginStatus = loginStatus;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}

	public boolean isLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}

	@Override
	public String toString() {
		return "LoginDetails [loginId=" + loginId + ", password=" + password + ", userName=" + userName + ", role="
				+ role + ", loginCount=" + loginCount + ", loginStatus=" + loginStatus + "]";
	}

}
