import static org.junit.Assert.*;

import org.junit.Test;

public class SubTest {

	@Test
	public void subTest() {
		Subtraction sub=new Subtraction();
		double re=sub.sub(20.0, 30.0);
		assertEquals(-10.0,re,0.0);
		
	}

}
