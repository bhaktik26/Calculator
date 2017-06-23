import static org.junit.Assert.*;

import org.junit.Test;

public class CosineTest {

	@Test
	public void cosTest() {
		 Cosine co=new Cosine();
		double re=co.cosine(0.0);
		assertEquals(1,re,0.01);
		
	}

}

