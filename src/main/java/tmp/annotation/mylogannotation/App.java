package tmp.annotation.mylogannotation;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {

	@MyLog(message = "hello world")
    public static void main( String[] args ) {
    	Map<String, String> res = MyLogInjector.injectLogs(new App());
    	
    	System.out.println(res.get("main"));
    	System.out.println(res.get("blah"));
    	System.out.println(res.get("bleh"));
    }
	
	@MyLog(message = "hello blah")
	public static void blah() {
		System.out.println("in blah");
		
	}
	
	@MyLog(message = "hello bleh")
	public void bleh() {
		System.out.println("in bleh");
	}
}
