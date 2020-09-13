package java8;

public class TargetType_Test {
	    
		//utility or userdefined method
		public void calculateStringLen(Calculator1 c) {
	   
			System.out.println("Inside calculateStringLen() ,executing lambda expression in Calculator1 interface");
			
	     }
		
		 public static void main(String[] argv) {
		    
			 Calculator1 cal1 = (String str) -> str.length();//assignment
		    
			 ScientificCalculator scient_cal1 = (String str) -> str.indexOf("Lambda");//assignment
		    
		    String name = "Java Lambda";
		    String name1 = "Java Lambda Expressions";

		    
		    int length = cal1.getStringLength(name);//lambda expression gets evaluated
		   
		    System.out.println(length);

		    System.out.println("Length of a String in ScientificCalculator Interface:-"+scient_cal1.noName(name1)) ; 
		    
		    
		   //calling a utility method 
		   TargetType_Test tt= new TargetType_Test();
		    tt.calculateStringLen((String str) -> str.length());
		    
		  }
		}//end of main class

		@FunctionalInterface
		interface Calculator1 {
		  int getStringLength(String str);
		}

		@FunctionalInterface
		interface ScientificCalculator {
		  int noName(String str);
		}