
class Weekday extends EnumValue<Weekday.e>
{
	public enum e {
		  MON,
		  TUE,
		  WED,
		  THU,
		  FRI,
		  SAT,
		  SUN;
	}
	
	protected void addEntries()
	{
		put(e.MON, 1, "Monday");
		put(e.TUE, 2, "Tuesday");
		put(e.WED, 3, "Wednesday");
		put(e.THU, 4, "Thursday");
		put(e.FRI, 5, "Friday");
		put(e.SAT, 6, "Saturday");
		put(e.SUN, 7, "Sunday");
	}

	/**
	 * 
	 */
	public Weekday() {
		super();
	}

	/**
	 * @param value
	 */
	public Weekday(e value) {
		super(value);
	}

	/**
	 * @param id
	 */
	public Weekday(Integer id) {
		super(id);
	}

	/**
	 * @param text
	 */
	public Weekday(String text) {
		super(text);
	}

	

}
	
