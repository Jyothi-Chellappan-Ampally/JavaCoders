//inner class demo
package java8;
public class Objectinfo2 {
	String software;
	Objectinfo2(String str)
	{
		//software=str;
	    software=str;
	  //  System.out.println("In enclosing class constructor"+ ObjectInfo.Objectone.training);
	    //System.out.println("In enclosing class constructor"+ ObjectInfo.Objectone.training);
	}
	public void display()
	{
		//System.out.println("display method in the outerclass"+software+training);
	}

	//inner class
class Objectone
{
	 String training="java Training";
	//String software;
	Objectone()
	{
		//training=software;
		 System.out.println("In inner class constructor"+training);
		 System.out.println("In inner class constructor outer class variable"+software);
	}
}
public static void main(String args[])
{
	
	System.out.println("Creating the object of outerclass");
	Objectinfo2 obinfo= new Objectinfo2("java"+"\n");
	System.out.println("Creating the object of innerclass");
	Objectone objone = obinfo.new Objectone();
	
}
}
