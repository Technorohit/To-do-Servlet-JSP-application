package com.in28min;

public class LoginService {


	public boolean isValidUser(String name, String pass) {
		if(name.equals("Rohit")&&pass.equals("123"))
			return true;
		return false;
	}
}
