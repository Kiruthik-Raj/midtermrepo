package MidtermMaven;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testprogram {
	public class verifytest {

		@Test
		public void testa() {
			sourceprog src = new sourceprog();
			Assertions.assertEquals(false,src.verify("notram", "1234") );
		}
		
		@Test
		public void testb()
		{
			sourceprog src2 = new sourceprog();
			Assertions.assertEquals(true,src2.verify("ram", "3025"));
		}

	}

}