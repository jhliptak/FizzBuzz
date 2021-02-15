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
		try {
			fb.process(0);
		} catch (Exception e) {
			return; // success
		}
		fail("Didn't get an exception for less than 1");
	}

	@Test
	void test101() {
		FizzBuzz fb = new FizzBuzz();
		try {
			fb.process(101);
		} catch (Exception e) {
			return; // success
		}
		fail("Didn't get an exception for less than 1");
	}

}
