package java8;

/*A functionalInterface is an interface with exactly one abstract method.
 * It can contain any number of default methods.
 * It can also have static methods.
 * 
 */

	@FunctionalInterface
	
	interface MyFunctionalInterface {

		//A method with no parameter
	    public String sayHello();
	  
	    default public void sayHello2() {
	    	System.out.println("inside default method");
	    }
	}
	
	public class LambdaExpressionNoParameter{

	   public static void main(String args[]) {
	        // lambda expression
	    	MyFunctionalInterface msg = () -> {
	    		return "Hello";
	    	};
	       
	    //	MyFunctionalInterface msg2 = () -> { return "";};
	    	
	    	System.out.println(msg.sayHello());
	    	
	    	msg.sayHello2();
	    }
	}
