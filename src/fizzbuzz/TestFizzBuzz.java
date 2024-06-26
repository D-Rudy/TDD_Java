package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFizzBuzz {
	FizzBuzz fb;

	@BeforeEach
	void init() {
		fb = new FizzBuzz();

	}

	@Test
	@DisplayName("Input = 0 -> 0")
	void shouldReturn0IfInputIs0() {
		assertEquals("0", fb.fizzBuzz(0));
	}

	@Test
	@DisplayName("Input = 1 -> 1")
	void shouldReturn1IfInputIs1() {
		assertEquals("1", fb.fizzBuzz(1));
	}

	@Test
	@DisplayName("Input = 2 -> 2")
	void shouldReturn2IfInputIs2() {
		assertEquals("2", fb.fizzBuzz(2));
	}

	@Test
	@DisplayName("Fizz si input est multiple de 3")
	void shouldReturnFizzIfInputIsMultipleOf3() {
		assertEquals("Fizz", fb.fizzBuzz(3));
	}

	@Test
	@DisplayName("Buzz si input est multiple de 5")
	void shouldReturnBuzzIfInputIsMultipleOf5() {
		assertEquals("Buzz", fb.fizzBuzz(5));
	}

	@Test
	@DisplayName("FizzBuzz si input est multiple de 3 et 5")
	void shouldReturnFizzBuzzIfInputIsMultipleOf3And5() {
		assertEquals("FizzBuzz", fb.fizzBuzz(15));
	}

}
