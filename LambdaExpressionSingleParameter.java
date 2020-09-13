package java8;

//A functional Interface of type 'predicate'
    interface Predicate_Function{
    	public boolean returnPersonType(int age);
    }
	
    @FunctionalInterface
	interface MyFunctionalInterface1 {

		//A 'function' type functional Interface
		//A method with single parameter 
	    public String incrementByFive(int a);
	    
	    
	}
	
	
	public class LambdaExpressionSingleParameter {

	   public static void main(String args[]) {
		   int i=10;
	        // lambda expression with single parameter num
	    	MyFunctionalInterface1 f = (num) -> { 
	    										num *= 5;
	    										if(num%2==0)
		    										return "num is even no:"+num;
	    										else
	    											return "num is odd no"+num;

	    										};
	         
	    	System.out.println(f.incrementByFive(22));
	    	
	    	
	    	/////////////calling a predicate function/////////////
	    	
	    	
	    	//int age =25;
	    	Predicate_Function pf=	(age)->{
	    								if(age>=18)
	    									return true;
	    								else
	    									return false;
	    							};
	    					System.out.println("Adult:-"+pf.returnPersonType(22));
	    					
	    					
					
	    }
	}
