package dev.boundary.waters.FizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void test1() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("1", fb.process(1), "failed for 1");
	}

	@Test
	void test3() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz", fb.process(3), "failed for 3");
	}

	@Test
	void test5() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Buzz", fb.process(5), "failed for 5");
	}

	@Test
	void test15() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("FizzBuzz", fb.process(15), "failed for 15");
	}

	@Test
	void test0() {
		FizzBuzz fb = new FizzBuzz();
		assertThrows(IllegalArgumentException.class, () -> fb.process(0),
				"arguments must be between 1 and 100");
	}

	@Test
	void test101() {
		FizzBuzz fb = new FizzBuzz();
		assertThrows(IllegalArgumentException.class, () -> fb.process(101),
				"arguments must be between 1 and 100");
	}
	
	@Test
	void testEmpty() {
		FizzBuzz fb = new FizzBuzz();
		assertThrows(IllegalArgumentException.class, () -> fb.fizzBuzz(0, 0, System.out::println),
				"input range can't be empty");
	}
	
	@Test
	void testOutOfOrder() {
		FizzBuzz fb = new FizzBuzz();
		assertThrows(IllegalArgumentException.class, () -> fb.fizzBuzz(101, 1, System.out::println),
				"start must be less than stop");
	}

}
