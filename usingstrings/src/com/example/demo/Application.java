package com.example.demo;

public class Application {

	public static void main(String[] args) {
		
		StringUtility utility = new StringUtility();
		
		String bestCity="Tenkasi";
		String prefCity="Tenkasi";
		
		System.out.println("Using=="+ (bestCity == prefCity));
		System.out.println("Using dot.equals"+ bestCity.equals(prefCity));
		
		String greatCity=prefCity;
		
		System.out.println("comparing greatCity and prefCity(==)"+(greatCity==prefCity));
		System.out.println("comparing greatcity and prefCity using  dot.equals"+ greatCity.equals(prefCity));
		
		
		System.out.println("====using String Objects====");
		
		String bestCityObj=new String("tenkasi");
		String prefCityObj= new String("tenkasi");// two different location bcz we use keyword new
		
		System.out.println("Using=="+ (bestCityObj == prefCityObj));
		System.out.println("Using dot.equals"+ bestCityObj.equals(prefCityObj));
		
		System.out.println("The SubString is"+ utility.getSubString("Abdul"));
		System.out.println("The checkcontain is "+ utility.checkContains("book", "a"));
		System.out.println(utility.checkPositionOfChar("book", 'o'));
		System.out.println(utility.joinTwoString("abdul", "Rahuman"));
		System.out.println(utility.replaceString("abdul", "rahuman"));
		System.out.println(utility.endsWithMethod("abdul", "rahuman"));
	
}
}
