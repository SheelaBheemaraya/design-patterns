package thbs.bt.bridge;

public class BridgePatternDemo {
	 public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      redCircle.draw();
	      greenCircle.draw();
	   }

}

//Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently.
/*This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes. 
Both types of classes can be altered structurally without affecting each other.*/