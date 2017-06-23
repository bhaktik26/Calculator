import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void addTest() {
		Addition add=new Addition();
		double re=add.add(20.0, 30.0);
		assertEquals(50.0,re,0.0);
		
	}

}
