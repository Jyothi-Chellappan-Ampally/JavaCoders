package java8;
/*
 * Usage of SUpplier Functional Interface
 */
import java.util.function.Supplier;
public class Supplier_Test1 {
  public static void main(String... args) {

	/*create a new object of patient class and assign to supplier
	 * :: is a method reference operator
	 * :: is a refined form of lambda expression
	 */
	  Supplier<Patient> personSupplier = Patient::new;//it will invoke default constructor
    
	  Supplier<Patient> personSupplier1 ;//= Patient::new;


   System.out.println(  personSupplier.get().firstName);
   System.out.println(  personSupplier.get().lastName);
   System.out.println(  personSupplier.get().bill);
    

    personSupplier1=()->new Patient("Manoj","Kumar",100000);
    
   System.out.println(personSupplier1.get().firstName);
   System.out.println(personSupplier1.get().lastName);
   System.out.println(personSupplier1.get().bill);
  }

private static Object Patient(String string, String string2) {
	// TODO Auto-generated method stub
	return null;
}
}
class Patient {
	//member variables
  String firstName;
  String lastName;
  long bill;
  
  
  //zero args cnstructor
  Patient() {}

  //paramterised constructor
  Patient(String firstName, String lastName,long bill) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.bill=bill;
  }

    
  //getters and setters
  public long getBill() {
	return bill;
}

public void setBill(long bill) {
	this.bill = bill;
}

}
