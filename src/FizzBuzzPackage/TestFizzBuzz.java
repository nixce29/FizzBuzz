package FizzBuzzPackage;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestFizzBuzz extends MyFizzBuzz{
	MyFizzBuzz testInput;
	
	@BeforeEach
	public void setUp() throws Exception{
		testInput = new MyFizzBuzz();
	}

	@Test
	@DisplayName("Input = 1 expected = 1")
	void test_input_is_1_expect_output_is_1() {
		String out = testInput.CheckFizzBuzz(1);
		assertEquals("1",out);
		
	}
	
	@Test
	@DisplayName("Input = 2 expected = 2")
	void test_input_is_2_expect_output_is_2() {
		String out = testInput.CheckFizzBuzz(2);
		assertEquals("2",out);
		
	}
	@Test
	@DisplayName("Input = 3 expected = Fizz")
	void test_input_is_3_expect_output_is_Fizz() {
		String out = testInput.CheckFizzBuzz(3);
		assertEquals("Fizz",out);
		
	}
	@Test
	@DisplayName("Input = 4 expected = 4")
	void test_input_is_4_expect_output_is_4() {
		String out = testInput.CheckFizzBuzz(4);
		assertEquals("4",out);
		
	}

}
