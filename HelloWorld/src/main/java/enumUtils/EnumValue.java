package enumUtils;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public abstract class EnumValue<Y extends Enum<Y>> {

	private Y value;
	private int intValue;
	private String stringValue;
	private boolean isValid = false;
	private final BiMap<Y, Integer> intToTypeMap = HashBiMap.create();
	private final BiMap<Y, String> stringToTypeMap =  HashBiMap.create();
	
	abstract protected void addEntries();
		
	protected EnumValue(EnumBuilder<Y> builder) { 
		addEntries();
		if (builder.enumVal != null) {
			this.value = builder.enumVal;
			this.intValue = intToTypeMap.get(builder.enumVal);
			this.stringValue = stringToTypeMap.get(builder.enumVal);
			
			// Since we constructed with an enum value, this is valid.
			isValid = true;
		} else if (builder.enumInt != null) {
			setInt(builder.enumInt);
		} else if (builder.enumString != null) {
			setString(builder.enumString);
		}
	}
	
	private void setInt(int id) {
	    this.value = fromInteger(id);
		this.intValue = id;
		if (this.value != null)
		{
			isValid=true;
			this.stringValue = stringToTypeMap.get(value);
	    }
		else
		{
			this.stringValue = "Invalid";
		}
	}
	
	private void setString(String text) {
		this.value = fromString(text);
		this.stringValue = text;
		if (this.value != null) { 
			isValid=true; 
			this.intValue = intToTypeMap.get(value);
		} else {
			this.intValue = 0;
		}
	}
	
	public Y value() { return value; }
	
	protected void put(Y value, int id, String text)
	{
		intToTypeMap.put(value, id);
		stringToTypeMap.put(value, text);
	}
	
	public boolean isValid() { return isValid;}	
	
	private Y fromInteger(int id) { return intToTypeMap.inverse().get(id);   }
	private Y fromString(String text) { return stringToTypeMap.inverse().get(text); }
	
	public int id() { return intValue;	}
	public String text() { return stringValue;	}
	
	public static class EnumBuilder<Y> {
		private Y enumVal = null;
		private Integer enumInt = null;
		private String enumString = null;
		
		public EnumBuilder(Y enumVal1) {
			this.enumVal = enumVal1;
		}
		
		public EnumBuilder(int enumInt) {
			this.enumInt = enumInt;
		}
		
		public EnumBuilder(String enumString) {
			this.enumString = enumString;
		}
	}

}
