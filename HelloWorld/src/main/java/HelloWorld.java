import java.lang.reflect.InvocationTargetException;

public class HelloWorld {
	public static void main (String args[]) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
	{
	
		try {
			
			//EnumMap<SomeClass> doesNotCompile;
			
						
			// Conversion from Enum to Integer and String
			Direction myDirection = new Direction(Direction.e.NORTH);
			System.out.println(myDirection.id());
			System.out.println(myDirection.text());
			
			// Conversion from Integer to Enum
	        Integer id = 55;
			Direction newDirection = new Direction(myDirection.fromInteger(id));
			System.out.println(newDirection);
			
			System.out.println(newDirection.id());
			System.out.println(newDirection.text());
			
			// Conversion from String to Enum
			String eastString = new String("this is south");
			Direction textDirection = new Direction(myDirection.fromString(eastString));
		    System.out.println(textDirection);
		    
			System.out.println(textDirection.id());
			System.out.println(textDirection.text());
			
			// Bad integer to Enum
			Integer badId = 5235;
			Direction badDirection =  new Direction(myDirection.fromInteger(badId));
			
			if (badDirection == null) {System.out.println("Bad direction"); }
		    System.out.println(badDirection);
		    
		    // Bad integer to Enum
		    String badString = "this is sparta";
		 	Direction badDirection2 = new Direction(myDirection.fromString(badString));
		 			
		 	if (badDirection2 == null) {System.out.println("Bad direction"); }
		 	System.out.println(badDirection2);
			 
			 
			
			 
			 
			
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}