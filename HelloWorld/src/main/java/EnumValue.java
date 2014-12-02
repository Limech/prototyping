
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public abstract class EnumValue<T extends IEnum, Y extends Enum<Y>> {

	private Y value;
	private Integer intValue;
	private String stringValue;
	private boolean isValid = false;
	private final BiMap<Y, Integer> intToTypeMap = HashBiMap.create();
	private final BiMap<Y, String> stringToTypeMap =  HashBiMap.create();
	
	abstract protected void addEntries();
	
	EnumValue() { 
		addEntries();
	}
	
	EnumValue(Y value) { 
		this.value = value;
		addEntries();
		this.intValue = intToTypeMap.get(value);
		this.stringValue = stringToTypeMap.get(value);
		isValid = true;

	}
	
	EnumValue(Integer id) {
		addEntries();
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
	
	EnumValue(String text) {
		addEntries();
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
	
	protected void put(Y value, Integer id, String text)
	{
		intToTypeMap.put(value, id);
		stringToTypeMap.put(value, text);
	}
	
	public boolean isValid() { return isValid;}	
	
	private Y fromInteger(Integer id) { return intToTypeMap.inverse().get(id);   }
	private Y fromString(String text) { return stringToTypeMap.inverse().get(text); }
	
	public Integer id() { return intValue;	}
	public String text() { return stringValue;	}

}
