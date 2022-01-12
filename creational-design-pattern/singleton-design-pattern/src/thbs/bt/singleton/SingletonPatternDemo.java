package thbs.bt.singleton;

public class SingletonPatternDemo {
	 public static void main(String[] args) {


	      //Get the only object available
	      SingleObject object = SingleObject.getInstance();

	      //show the message
	      object.showMessage();
	   }
}

/*This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. 
 This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.*/