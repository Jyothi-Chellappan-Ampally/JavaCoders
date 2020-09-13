package java8;
public class ObjectInfo {
	String software;
	
	ObjectInfo(String str)	{
		//software=str;
	    this.software=str;
	    System.out.println("In enclosing class constructor"+ ObjectInfo.Objectone.training);
	}
static class Objectone{
	static String training="java Training";
	String software;
	Objectone()
	{
		//training=software;
		 System.out.println("In inner class constructor"+training);
	}
}
public static void main(String args[]){
	
	System.out.println("Creating the object of outerclass");
	ObjectInfo obinfo= new ObjectInfo("java"+"\n");
	System.out.println("Creating the object of innerclass");
	Objectone objone = new Objectone();
	
}
}
