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
	@Test
	@DisplayName("Input = 5 expected = Buzz")
	void test_input_is_5_expect_output_is_Buzz() {
		String out = testInput.CheckFizzBuzz(5);
		assertEquals("Buzz",out);
		
	}
	@Test
	@DisplayName("Input = 6 expected = Fizz")
	void test_input_is_6_expect_output_is_Fizz() {
		String out = testInput.CheckFizzBuzz(6);
		assertEquals("Fizz",out);
		
	}
	@Test
	@DisplayName("Input = 7 expected = 7")
	void test_input_is_7_expect_output_is_7() {
		String out = testInput.CheckFizzBuzz(7);
		assertEquals("7",out);
		
	}
	@Test
	@DisplayName("Input = 8 expected = 8")
	void test_input_is_8_expect_output_is_8() {
		String out = testInput.CheckFizzBuzz(8);
		assertEquals("8",out);
		
	}
	@Test
	@DisplayName("Input = 9 expected = Fizz")
	void test_input_is_9_expect_output_is_Fizz() {
		String out = testInput.CheckFizzBuzz(9);
		assertEquals("Fizz",out);
		
	}
	@Test
	@DisplayName("Input = 10 expected = Buzz")
	void test_input_is_10_expect_output_is_Buzz() {
		String out = testInput.CheckFizzBuzz(10);
		assertEquals("Buzz",out);
		
	}
	@Test
	@DisplayName("Input = 11 expected = 11")
	void test_input_is_11_expect_output_is_11() {
		String out = testInput.CheckFizzBuzz(11);
		assertEquals("11",out);
		
	}
	@Test
	@DisplayName("Input = 12 expected = Fizz")
	void test_input_is_12_expect_output_is_Fizz() {
		String out = testInput.CheckFizzBuzz(12);
		assertEquals("Fizz",out);
		
	}
	@Test
	@DisplayName("Input = 13 expected = 13")
	void test_input_is_13_expect_output_is_13() {
		String out = testInput.CheckFizzBuzz(13);
		assertEquals("13",out);
		
	}
	@Test
	@DisplayName("Input = 14 expected = 14")
	void test_input_is_14_expect_output_is_14() {
		String out = testInput.CheckFizzBuzz(14);
		assertEquals("14",out);
		
	}

}
