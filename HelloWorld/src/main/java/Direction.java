import enumUtils.EnumValue;
import enumUtils.IsEnumValue;



@IsEnumValue
class Direction extends EnumValue<Direction.e>
{
	Direction(EnumBuilder<Direction.e> builder) {
		super(builder);
	}

	public enum e {
		  NORTH,
		  SOUTH,
		  EAST,
		  WEST;
	}
	
	@Override
	protected void addEntries()
	{
		put(e.NORTH, 1, "this is north");
	    put(e.SOUTH, 2, "this is south");
	    put(e.EAST, 55, "this is east");
	    put(e.WEST, 45, "this is west");
	}
	
}
	
