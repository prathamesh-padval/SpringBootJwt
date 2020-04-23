package com.dev.entity;

public class JwtResponse {

	private final String jwttoken;

	private final String loginTime;

	public JwtResponse(String jwttoken, String loginTime) {
		super();
		this.jwttoken = jwttoken;
		this.loginTime = loginTime;
	}

	public String getJwttoken() {
		return jwttoken;
	}

	public String getLoginTime() {
		return loginTime;
	}

}
