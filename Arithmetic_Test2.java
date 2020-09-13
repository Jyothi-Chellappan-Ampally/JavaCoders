package java8;

public class Arithmetic_Test2 {
	
		  public static void main(String[] argv) {
			  //behaviour ambiguity in lambda expressions
		    calculate((IntCalculator)(x,y)-> x + y);
		   // calculate((IntCalculator)(x,y)-> x * y);
		    calculate((LongCalculator)(x,y)-> x / y);
		   // calculate((LongCalculator)(x,y)-> x % y);
		    
		    IntCalculator iCal = (x,y)-> x + y;//to avoid lambda behaviour ambiguity
		  }
		  
		  //method overloading
		  private static void calculate(IntCalculator calculator){
		    int x = 162, y = 34;
		    int result = calculator.calculate(x,y);
		    System.out.println(result);
		  }
		  
		  private static void calculate(LongCalculator calculator){
		    long x = 2, y = 4;
		    long result = calculator.calculate(x,y);
		    System.out.println(result);
		  }  
		}

//BiFunction Interface type(model)
		@FunctionalInterface
		interface IntCalculator{
		  int calculate(int x, int y);
		}

		@FunctionalInterface
		interface LongCalculator{
		  long calculate(long x, long y);
		}