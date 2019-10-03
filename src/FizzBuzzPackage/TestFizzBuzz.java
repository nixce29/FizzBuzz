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

}
