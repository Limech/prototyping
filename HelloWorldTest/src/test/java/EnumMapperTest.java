import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;


import enumUtils.EnumValue;
import enumUtils.EnumValue.EnumBuilder;

public class EnumMapperTest {
		
	@Before
	public void setup()
	{
    }

	@Test
	public void GivenGoodEnum()  {

		//EnumValue.EnumBuilder<Direction.e>()
			// Conversion from Enum to Integer and String
		int id = 1;	
		    Direction myDirection = new Direction(new EnumValue.EnumBuilder(id));
			
			assertEquals(myDirection.id(), 1);
			assertEquals(myDirection.text(), "this is north");
			assertEquals(myDirection.value(), Direction.e.NORTH);
			assertEquals(myDirection.isValid(), true);
		

	}

	@Test
	public void GivenIntegerConvertToEnum()  {
			// Conversion from Integer to Enum
		int id = 55;		
			//Direction myDirection= new Direction(id);
			Direction myDirection = new Direction(new EnumValue.EnumBuilder(id));
	
			assertEquals(myDirection.id(), id);
			assertEquals(myDirection.text(), "this is east");
			assertEquals(myDirection.value(), Direction.e.EAST);
			assertEquals(myDirection.isValid(), true);
	}
	
	@Test
	public void GivenStringConvertToEnum()  {
			// Conversion from String to Enum
			String eastString = new String("this is south");
			//Direction myDirection = new Direction(eastString);
			Direction myDirection = new Direction(new EnumValue.EnumBuilder(eastString));

			assertEquals(myDirection.id(), 2);
			assertEquals(myDirection.text(), "this is south");
			assertEquals(myDirection.value(), Direction.e.SOUTH);
			assertEquals(myDirection.isValid(), true);
	}
	
	@Test
	public void GivenBadIntegerConvertToEnum()  {
		
			// Bad integer to Enum
			int badId = 5235;
			//Direction myDirection = new Direction(badId);
			Direction myDirection = new Direction(new EnumValue.EnumBuilder(badId));
			
			assertNull(myDirection.value());
			assertEquals(myDirection.id(), badId);
			assertEquals(myDirection.text(), "Invalid");
			assertEquals(myDirection.isValid(), false);

	}
	
	@Test
	public void GivenBadStringConvertToEnum()  {
		    // Bad integer to Enum
		    String badString = "this is sparta";
		    //Direction myDirection = new Direction(badString);
		    Direction myDirection = new Direction(new EnumValue.EnumBuilder(badString));
		    
		    assertEquals(myDirection.isValid(), false);
		    assertEquals(myDirection.id(), 0);
			assertEquals(myDirection.text(), badString);	
		 	assertNull(myDirection.value());
	}
	
	@Test
	public void GivenGoodWeekdayEnum()  {
		    WeekdayUiNames myWeekday = new WeekdayUiNames(new EnumValue.EnumBuilder(Weekday.MON));
		
			assertEquals(myWeekday.id(), 1);
			assertEquals(myWeekday.text(), "Monday");
			assertEquals(myWeekday.value(), Weekday.MON);
			assertEquals(myWeekday.isValid(), true);
		
	}
	
}
