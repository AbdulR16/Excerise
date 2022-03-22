package example.demo;

public class Application3 {
	public static void main(String[] args) {
	
	byte b = 6;
	b+=8;
	System.out.println(b);
	b = (byte) (b+7); // here 7 is int by default
	System.out.println(b);

}
}