package com.jwt.model;

public class JwtResponse {
	
	String token;

	public JwtResponse() {
		
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public JwtResponse(String token) {
		super();
		this.token = token;
	}
	
	

}
