package java8;

	import java.util.function.Consumer;
	
	public class Consumer_Test {
	  public static void main(String[] args) {
	  
		Message message = new Message("Peter Completed Graduation.Working as a SE since 5 years.");
	   
		Person person = new Person("Abraham");

		//Consumer is a predefined 'Functional Interface'
		//Passing 'Message' object as parameter
	    Consumer<Message> messageConsumer = (t) -> System.out.println(t);
	    messageConsumer.accept(message);

	  //Consumer is a predefined 'Functional Interface'
	  //Passing 'Person' object as parameter
	    Consumer<Person> personConsumer = (t) -> System.out.println(t);
	    personConsumer.accept(person);

	  }
	}

	//Person is a userdefined class
	class Person {
	     private String name;
	    
	     //constructor
	    public Person(String name) {
	    this.name = name;
	  }

	    //getters and setters
	  public String getName() {
	    return name;
	  }

	  public String toString() {
	    return getName();
	  }
	}

	//Message class is a userdefined class
	class Message {
	     private String msg;
	    
	     //constructor is used to create objects
	    public Message(String message) {
	    this.msg = message;
	  }

	    //getters and setters
	  public String getMsg() {
	    return msg;
	  }

	  public String toString() {
	    return getMsg();
	  }
	}