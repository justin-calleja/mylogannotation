package tmp.annotation.mylogannotation;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class MyLogInjector {
	
	public static Map<String, String> injectLogs(Object obj) {
		Map<String, String> res = new HashMap<String, String>();

		Class<?> cl = obj.getClass();
		res.put("className", cl.getName());
		for(Method m : cl.getDeclaredMethods()) {
			MyLog mylog = m.getAnnotation(MyLog.class);
			if(mylog != null) {
				res.put(m.getName(), mylog.message());
			} 
		}
		return res;
	}

}
