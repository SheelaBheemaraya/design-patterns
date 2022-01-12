package thbs.bt.prototype;

public class PrototypePatternDemo {
	public static void main(String[] args) {
	      ShapeCache.loadCache();

	      Shape clonedShape = (Shape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());		

	      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());		

	      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
	      System.out.println("Shape : " + clonedShape3.getType());		
	   }

}

//Prototype pattern refers to creating duplicate object while keeping performance in mind.
//This pattern involves implementing a prototype interface which tells to create a clone of the current object.
// We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.