package day01;

public class S {
 public static void main(String[] args) {
	String a = "Hello Java";
	String b = "hello";
	String c = new String("hello");
	System.out.println(a.equals(b));
	System.out.println(a==b);
	System.out.println(a.indexOf("Java"));
	System.out.println(a.replaceAll("Java", "World"));
	System.out.println(a.substring(0,4));
	System.out.println(a.toLowerCase());

	
}
}
