
package mail;

import static org.junit.Assert.*;

import org.junit.Test; 


/**
 * @author MiltiadisKontos
 *
 */
public class SubtractTest {
	@Test
	public void testSubtractTwoIntegers() {
		subtract subTest=new subtract();
		 assertEquals("POSITIVE", subTest.subtractTwoIntegers(7, 5));
		 assertEquals("NEGATIVE", subTest.subtractTwoIntegers(5, 8));

	}

}
