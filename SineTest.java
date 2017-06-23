import static org.junit.Assert.*;

import org.junit.Test;

public class SineTest {

	@Test
	public void sinTest() {
		 Sine si=new Sine();
		double re=si.sine(90.0);
		assertEquals(1,re,0.01);
		
	}

}
