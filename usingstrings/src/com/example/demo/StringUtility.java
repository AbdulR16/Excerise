package com.example.demo;

public class StringUtility {
	
	public static String getSubString(String args) {
		return args.substring(2,5);
		
	}
	
	public static boolean checkContains(String arg,CharSequence srchchar) {
		
	
			
		return arg.contains(srchchar);
		
		
	}
	public static int checkPositionOfChar(String arg,char srchChar) {
		
		
		return arg.indexOf(srchChar);
		
	}
	public static String joinTwoString(String str1,String str2) {
		return str1.concat(str2);
		
		
	}
	public static String replaceString(String originalString,String replaceString) {
		
		return originalString.replaceAll(originalString, replaceString);
		
	
	}
	public static boolean endsWithMethod(String args,String str) {
		
		return args.endsWith(str);
}
	
}