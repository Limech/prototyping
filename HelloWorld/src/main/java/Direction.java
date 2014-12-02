
class Direction extends EnumValue<Direction, Direction.e> implements IEnum
{
	public enum e {
		  NORTH,
		  SOUTH,
		  EAST,
		  WEST;
	}
	
	protected void addEntries()
	{
		put(e.NORTH, 1, "this is north");
	    put(e.SOUTH, 2, "this is south");
	    put(e.EAST, 55, "this is east");
	    put(e.WEST, 45, "this is west");
	}

	public Direction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Direction(e value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	public Direction(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public Direction(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}
	
	
}
	
