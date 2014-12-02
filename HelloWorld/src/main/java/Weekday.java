
class Weekday extends EnumValue<Weekday, Weekday.e> implements IEnum
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
	
	private void addEntries()
	{
		put(e.MON, 1, "Monday");
		put(e.TUE, 2, "Tuesday");
		put(e.WED, 3, "Wednesday");
		put(e.THU, 4, "Thursday");
		put(e.FRI, 5, "Friday");
		put(e.SAT, 6, "Saturday");
		put(e.SUN, 7, "Sunday");
		
	}
	
	Weekday()
	{
		super();
		addEntries();
	}
	
	Weekday(e value)
	{ 
		super(value);
		addEntries();
	}
	
}
	
