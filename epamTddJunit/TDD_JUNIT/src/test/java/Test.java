import static org.junit.Assert.*;

import epam.Testing;

public class Test {

	Testing test=new Testing();
	
	@org.junit.Test
	public void test1()	{
		assertEquals("",test.aString(""));
	}
	
	@org.junit.Test
	public void test2()	{
		assertEquals("B",test.aString("B"));
	}
	
	@org.junit.Test
	public void test3()	{
		assertEquals("B",test.aString("AAB"));	
	}	
	
	@org.junit.Test
	public void test4()	{
		assertEquals("BCD",test.aString("ABCD"));	
	}	
	
	@org.junit.Test
	public void test5()	{
		assertEquals("BCD",test.aString("BACD"));	
	}	
	
	@org.junit.Test
	public void test6()	{
		assertEquals("BCDE",test.aString("BCDE"));	
	}
}
