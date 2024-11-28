package java8;
import java.util.*;
	public class Arithmetic_Test {
		  public static void main(String[] argv) {
		
			  //calculate is a static method so object is not required to call
		//Changing the behavior of a method through its parameters is called behavior parameterization.
		    calculate((x,y)-> x + y);
		    calculate((x,y)-> x * y);
		    calculate((x,y)-> x / y);
		    calculate((x,y)-> x % y);
		  }
		 
		  //static method
		  private static void calculate(Calculator calculator){
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter First Value:");
			  int x=  sc.nextInt();
			  System.out.println("Enter Second Value:");
		      int y = sc.nextInt();
		      
		    int result = calculator.calculate(x,y);//lambda expression gets executed
		    System.out.println(result);
		  }
		  
	}

		@FunctionalInterface
		interface Calculator{
		  int calculate(int x, int y);
		}
