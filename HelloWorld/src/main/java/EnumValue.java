
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class EnumValue<T extends IEnum, Y extends Enum<Y>> {

	private Y value;
	private final BiMap<Y, Integer> intToTypeMap = HashBiMap.create();
	private final BiMap<Y, String> stringToTypeMap =  HashBiMap.create();
	
	EnumValue() { 

	}
	
	EnumValue(Y value) { 
		this.value = value;
	}
	
	public Y value() { return value; }
	
	protected void put(Y value, Integer id, String text)
	{
		intToTypeMap.put(value, id);
		stringToTypeMap.put(value, text);
	}
	
	public Y fromInteger(Integer id) {  return intToTypeMap.inverse().get(id);	}
	public Y fromString(String text) { return stringToTypeMap.inverse().get(text); }
	
	public Integer id() { return intToTypeMap.get(value);	}
	public String text() { return stringToTypeMap.get(value);	}

}
