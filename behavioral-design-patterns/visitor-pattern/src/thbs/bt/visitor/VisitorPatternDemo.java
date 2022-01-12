package thbs.bt.visitor;

public class VisitorPatternDemo {
	 public static void main(String[] args) {

	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	   }
}


// As per the pattern, element object has to accept the visitor object so that visitor object handles the operation on the element object

/*We are going to create a ComputerPart interface defining accept opearation.Keyboard, Mouse, Monitor and Computer are concrete classes implementing ComputerPart interface. We will define another interface ComputerPartVisitor which will define a visitor class operations. Computer uses concrete visitor to do corresponding action*/