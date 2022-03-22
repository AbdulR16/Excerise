package com.example.demo;

public class Application {

	public static void main(String[] args) {
	
		MyService service = new MyService();
		
		//service.mark(55);
		
		service.markWithNestedTryCatch("50");
		
		service.tryWithMultipleCatch("60");
		
		String city =null;
		
		try {
			service.exampleForDeclare(city);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

}
}