import enumUtils.EnumValue;


public class WeekdayUiNames extends EnumValue<Weekday> {

	protected WeekdayUiNames(enumUtils.EnumValue.EnumBuilder<Weekday> builder) {
		super(builder);
	}

	@Override
	protected void addEntries() {
        put(Weekday.MON, 1, "Monday");
        put(Weekday.TUE, 2, "Tuesday");
        put(Weekday.WED, 3, "Wednesday");
        put(Weekday.THU, 4, "Thursday");
        put(Weekday.FRI, 5, "Friday");
        put(Weekday.SAT, 6, "Saturday");
        put(Weekday.SUN, 7, "Sunday");

	}
}
