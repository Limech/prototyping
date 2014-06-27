import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;


public class EnumMapperTest {
	
	private EnumMapper<Direction> directionEnumMap;
	
	@Before
	public void setup()
	{
		 try {
			directionEnumMap = new EnumMapper<Direction>(Direction.values());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void GivenGoodEnum()  {
		
			// Conversion from Enum to Integer and String
			Direction myDirection = Direction.NORTH;
			
			assertEquals(myDirection.asInteger(), new Integer(1));
			assertEquals(myDirection.asString(), "this is north");

	}

	@Test
	public void GivenIntegerConvertToEnum()  {
			// Conversion from Integer to Enum
		    Integer id = 55;
			Direction myDirection = directionEnumMap.fromInteger(id);
			
			assertEquals(myDirection.asInteger(), new Integer(id));
			assertEquals(myDirection.asString(), "this is east");
			assertEquals(myDirection, Direction.EAST);
	}
	
	@Test
	public void GivenStringConvertToEnum()  {
			// Conversion from String to Enum
			String eastString = new String("this is south");
			Direction myDirection = directionEnumMap.fromString(eastString);

			assertEquals(myDirection.asInteger(), new Integer(2));
			assertEquals(myDirection.asString(), "this is south");
			assertEquals(myDirection, Direction.SOUTH);
	}
	
	@Test
	public void GivenBadIntegerConvertToEnum()  {
		
			// Bad integer to Enum
			Integer badId = 5235;
			Direction myDirection = directionEnumMap.fromInteger(badId);
			
			assertNull(myDirection);

	}
	
	@Test
	public void GivenBadStringConvertToEnum()  {
		    // Bad integer to Enum
		    String badString = "this is sparta";
		 	Direction myDirection = directionEnumMap.fromInteger(badString);
		 			
		 	assertNull(myDirection);

		
	}

}
