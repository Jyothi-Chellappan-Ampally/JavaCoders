package java8;

//Returning a lambdaExpression from a method
	public class Lambda_Return {
		  public static void main(String[] argv) {
		    System.out.println(perform().calculate(2, 2));
		  }
		  //static method
		  private static Calculator2 perform(){
		    return (x,y)-> x / y;
		  }  
		}

		@FunctionalInterface
		interface Calculator2{
		  long calculate(long x, long y);
		}
		