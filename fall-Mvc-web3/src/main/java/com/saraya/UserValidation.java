package com.saraya;
public class UserValidation {
	public boolean  userValidation (String username, String password) {
		if(username.equalsIgnoreCase("serigne") && password.equals("2104")) {
		return true;
	} 
		else {
		return false;
	}

}

}
