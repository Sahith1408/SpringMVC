package com.spring.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("sahith") && password.equals("1408");
	}

}