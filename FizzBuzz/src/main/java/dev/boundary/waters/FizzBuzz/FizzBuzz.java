package dev.boundary.waters.FizzBuzz;

import java.util.function.Consumer;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

/**
 * A canonical FizzBuzz implementation.
 * 
 * Write a program that prints the numbers from 1 to 100. 
 * But for multiples of three print “Fizz” instead of the number.
 * For the multiples of five print “Buzz”. 
 * For numbers which are multiples of both three and five print “FizzBuzz”.
 * 
 */
@Component("fizzBuzz")
public class FizzBuzz {
	
	public void fizzBuzz(int start, int finish, Consumer<String> func) {
		if(start >= finish) {
			throw new IllegalArgumentException("start " + start + " must be less than finish " + finish);
		}
		IntStream.range(start, finish).mapToObj(n -> process(n)).forEach(s -> func.accept (s));
	}

	protected String process(int i) {
		if(i < 1 || i > 100) {
			throw new IllegalArgumentException("FizzBuzz only defined between 1 and 100");
		}
		boolean isFactorThree = ((i % 3) == 0);
		boolean isFactorFive = ((i % 5) == 0);
		
		if(isFactorThree && isFactorFive) {
			return "FizzBuzz";
		} else if(isFactorThree) {
			return "Fizz";
		} else if(isFactorFive) {
			return "Buzz";
		} else {
			return Integer.toString(i);
		}
	}

}
