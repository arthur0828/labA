package test;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import main.MathUtil;



@DisplayName ("Math Util")
class MassUtilTest {
//create instance of class
	MathUtil calc = new MathUtil();
	
	//Annotation
	//identifies what methods are to be run as tests
	@Test
	void testadd() {
		
		
		//set wht is expected
		int expected =2;
		
		//Actual
		int actual = calc.add(1, 1);
		
		//verify 
		assertEquals(actual, expected);
	}
	
	@Test 
	@DisplayName ("isOdd return true for odd values")
	void testIsOdd() {
		//Create instance of class
		MathUtil calk = new MathUtil();
		//expected
		//actual
		boolean actual = calc.isOdd(3);
		//verify
		assertTrue(actual);
		
	}

}