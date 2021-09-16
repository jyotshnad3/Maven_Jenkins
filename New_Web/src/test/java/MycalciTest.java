import static org.junit.Assert.*;

import org.junit.Test;

public class MycalciTest {

	
	@Test
	public void test1() {
		Mycalculator mp=new Mycalculator();
		int ans=mp.diff(15, 5);
		assertEquals(10,ans);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		Mycalculator mp=new Mycalculator();
		int ans=mp.sum(10,6);
		assertEquals(16,ans);
		//fail("Not yet implemented");
	}
    
	@Test
	public void test3() {
		Mycalculator mp=new Mycalculator();
		int ans=mp.sum(16,6);
		assertEquals(22,ans);
		//fail("Not yet implemented");
	}
}
