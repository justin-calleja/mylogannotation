package tmp.annotation.mylogannotation;

import java.util.Map;

import static org.junit.Assert.*;
import org.junit.Test;


public class MyLogInjectorTest {
	
	@MyLog(message="logging testJavaLangClass")
	@Test
	public void testJavaLangClass() {
		Map<String, String> res = MyLogInjector.injectLogs(MyLogInjectorTest.class);

		assertEquals("java.lang.Class", res.get("className"));
		assertEquals(1, res.size());
	}
	
	@Test
	public void testMyLogInjectorTestInstance() {
		Map<String, String> res = MyLogInjector.injectLogs(new MyLogInjectorTest());

		assertEquals("tmp.annotation.mylogannotation.MyLogInjectorTest", res.get("className"));
		assertEquals("logging testJavaLangClass", res.get("testJavaLangClass"));
		assertEquals(2, res.size());
	}

}
