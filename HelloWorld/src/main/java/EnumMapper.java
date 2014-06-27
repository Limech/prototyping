import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;



public class EnumMapper<T extends IEnum> {

   private final Map<Object, T> intToTypeMap = new HashMap<Object, T>();
   private final Map<Object, T> stringToTypeMap = new HashMap<Object, T>();

   public EnumMapper(T[] t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
   {
	  
	   for (T e : t)
	   {
		   intToTypeMap.put(e.id(), e);
		   stringToTypeMap.put(e.text(), e);
	   }
	  
   }
   
   public T fromInteger(Object key)
   {
	   return intToTypeMap.get(key);
   }
  
   public T fromString(Object key)
   {
	   return stringToTypeMap.get(key);
   }
}


