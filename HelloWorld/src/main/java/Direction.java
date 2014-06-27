
//@EnumAnnotation
public enum Direction implements IEnum {
	  NORTH (1, "this is north"),
	  SOUTH (2, "this is south"),
	  EAST (55, "this is east"),
	  WEST (22, "this is west");

	private Direction(Integer id, String text ) {
		this.id = id;
		this.text = text;
	}
	
	private final Integer id;
	private final String text;
	public Integer asInteger() { return id;}
	public String asString() { return text;}
}
	
