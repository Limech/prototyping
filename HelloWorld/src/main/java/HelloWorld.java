import java.lang.reflect.InvocationTargetException;

public class HelloWorld {
	public static void main (String args[]) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
	{
	
		try {
					
			
			for (Direction.e dir : Direction.e.values()) {
				Direction myDirection = new Direction(dir);
				System.out.println(myDirection.id());
				System.out.println(myDirection.text());
				System.out.println(myDirection.value().toString());
				System.out.println("\n");
			}
			System.out.println("\n\n\n");
			
			// Conversion from Enum to Integer and String
			Direction myDirection = new Direction(Direction.e.NORTH);
				
			System.out.println(myDirection.id());
			System.out.println(myDirection.text());
			
			// Conversion from Integer to Enum
			Direction newDirection = new Direction(55);
			System.out.println(newDirection.text());
			System.out.println(newDirection.id());
			System.out.println(newDirection.toString());
			
			// Conversion from String to Enum
			Direction textDirection = new Direction("this is south");		    
			System.out.println(textDirection.id());
			System.out.println(textDirection.text());
			
			
			 
			 
			
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
}