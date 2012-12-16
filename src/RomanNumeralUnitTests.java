import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("M", number.toRoman(1000));
		assertEquals("XIX", number.toRoman(19));
		assertEquals("XLIX", number.toRoman(49));
		//assertEquals("II", number.toRoman(2));
	}
	

}
