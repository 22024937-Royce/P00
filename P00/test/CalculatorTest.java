import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}



	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	

	@Before
	public void setUp() throws Exception {
	}
	public void testAdd() {
//		fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	public void testSubtract(){
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);
		int expected =  3087;
		assertEquals (expected, actual);
				
				
	}
	public void testMultiple() {
		int a  = 6;
		int b = 2;
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		int expected =  12;
		assertEquals (expected, actual);
	}
	public void testDivide() {
		int a = 4;
		int b = 2;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected =  2;
		assertEquals (expected, actual);
		
			
	}

	@After
	public void tearDown() throws Exception {

			

	}
		
	

	@Test
	public void test() {
//		fail("Not yet implemented");
		
	}
	 
				 
			
	}


