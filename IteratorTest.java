package java8;

	import java.util.List;
	import java.util.ArrayList;
import java.util.Iterator;
	public class IteratorTest {
		public static void main(String[] argv) {
			List names = new ArrayList<>();
			names.add("java");
			names.add("python");
			names.add("Cpp");
			names.add("AdvancedJava");
			names.add("JavaScript");
			
		//	Iterate without using Lambda
			//Iterator is an interface called on collections to traverse/iterate through the collection object.
		/*	 Iterator iterator = names.iterator();
			 while (iterator.hasNext()) {
				System.out.println(iterator.next());
			 } */
			
			 
			names.forEach(name->System.out.println(name));
		}
	}
