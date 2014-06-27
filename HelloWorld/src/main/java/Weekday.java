
public enum Weekday implements IEnum {
	  MON (1, "Monday"),
	  TUE (2, "Tuesday"),
	  WED (3, "Wednesday"),
	  THU (4, "Thursday"),
	  FRI (5, "Friday"),
	  SAT (6, "Saturday"),
	  SUN (7, "Sunday");



	private Weekday(Integer id, String text ) {
		this.id = id;
		this.text = text;
	}
	
	private  Integer id;
	private  String text;
	public Integer asInteger() { return id;}
	public String asString() { return text;}
}