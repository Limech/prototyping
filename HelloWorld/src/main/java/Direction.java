
class Direction extends EnumValue<Direction, Direction.e> implements IEnum
{
	public enum e {
		  NORTH,
		  SOUTH,
		  EAST,
		  WEST;
	}
	
	private void addEntries()
	{
		put(e.NORTH, 1, "this is north");
	    put(e.SOUTH, 2, "this is south");
	    put(e.EAST, 55, "this is east");
	    put(e.WEST, 45, "this is west");
	}
	
	Direction()
	{
		super();
		addEntries();
	}
	
	Direction(e value)
	{ 
		super(value);
		addEntries();
	}
	
}
	
