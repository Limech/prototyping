import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;


public class EnumMapperTest {
		
	@Before
	public void setup()
	{
    }

	@Test
	public void GivenGoodEnum()  {
		
			// Conversion from Enum to Integer and String
			Direction myDirection = new Direction(Direction.e.NORTH);
			
			assertEquals(myDirection.id(), new Integer(1));
			assertEquals(myDirection.text(), "this is north");
			assertEquals(myDirection.value(), Direction.e.NORTH);
			assertEquals(myDirection.isValid(), true);
		

	}

	@Test
	public void GivenIntegerConvertToEnum()  {
			// Conversion from Integer to Enum
		    Integer id = 55;		
			Direction myDirection= new Direction(id);
	
			assertEquals(myDirection.id(), new Integer(id));
			assertEquals(myDirection.text(), "this is east");
			assertEquals(myDirection.value(), Direction.e.EAST);
			assertEquals(myDirection.isValid(), true);
	}
	
	@Test
	public void GivenStringConvertToEnum()  {
			// Conversion from String to Enum
			String eastString = new String("this is south");
			Direction myDirection = new Direction(eastString);

			assertEquals(myDirection.id(), new Integer(2));
			assertEquals(myDirection.text(), "this is south");
			assertEquals(myDirection.value(), Direction.e.SOUTH);
			assertEquals(myDirection.isValid(), true);
	}
	
	@Test
	public void GivenBadIntegerConvertToEnum()  {
		
			// Bad integer to Enum
			Integer badId = 5235;
			Direction myDirection = new Direction(badId);
			
			assertNull(myDirection.value());
			assertEquals(myDirection.id(), new Integer(badId));
			assertEquals(myDirection.text(), "Invalid");
			assertEquals(myDirection.isValid(), false);

	}
	
	@Test
	public void GivenBadStringConvertToEnum()  {
		    // Bad integer to Enum
		    String badString = "this is sparta";
		    Direction myDirection = new Direction(badString);
		    
		    assertEquals(myDirection.isValid(), false);
		    assertEquals(myDirection.id(), new Integer(0));
			assertEquals(myDirection.text(), badString);	
		 	assertNull(myDirection.value());

		
	}

}
