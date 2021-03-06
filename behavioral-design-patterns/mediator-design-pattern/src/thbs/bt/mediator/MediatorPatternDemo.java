package thbs.bt.mediator;

public class MediatorPatternDemo {
	 public static void main(String[] args) {
	      User robert = new User("Robert");
	      User john = new User("John");

	      robert.sendMessage("Hi! John!");
	      john.sendMessage("Hello! Robert!");
	   }
// User objects will use ChatRoom method to share their messages.
}


//This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling.
