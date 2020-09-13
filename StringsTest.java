package java8;

public class StringsTest {
	public static void main(String args[]) {
        // lambda expression with multiple arguments
    	String_Samples s = (str1, str2) -> str1 + str2.concat("Programing");
       
    	System.out.println("Result: "+s.sconcat("Hello ", "Welcome to Java8"));
    	
    }

}
