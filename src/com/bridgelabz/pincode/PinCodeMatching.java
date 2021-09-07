package com.bridgelabz.pincode;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PinCodeMatching {

	public static boolean pincodePatternMatcher(String pincode) {
		Pattern pattern = Pattern.compile("^[0-9]{6}$");
		Matcher matcher = pattern.matcher(pincode);
		return matcher.matches();
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Pin code matching program");
		String pincode="400088B";
		if(pincodePatternMatcher(pincode))
			System.out.println("It is a valid pincode");
		else 
			System.out.println("It is an invalid pincode");

	}
}
