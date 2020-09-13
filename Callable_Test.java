package java8;

import java.util.*;
	
	//creating callable interface 
	import java.util.concurrent.Callable;
	public class Callable_Test {
	  public static void main(String args[]) {
	    Callable<String> c = () -> {	
	    	
	    	String name="123";
    	System.out.println("Enter the name value:");
    	Scanner s = new Scanner(System.in);
    	name=s.next();//reading a string
    	
    	System.out.println(name.charAt(10));//charAt() is a predefined function
    	
    	return name;    };
	    
	  //  System.out.println(c.call());
	  
	    try {
	      System.out.println(c.call());
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	      
	    }
	  } 
	}
