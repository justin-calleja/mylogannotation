package tmp.annotation.mylogannotation;

/**
 * Hello world!
 *
 */
public class App {

	@MyLog(message = "hello world")
    public static void main( String[] args ) {
    	MyLogInjector.injectLogs(new App());

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
