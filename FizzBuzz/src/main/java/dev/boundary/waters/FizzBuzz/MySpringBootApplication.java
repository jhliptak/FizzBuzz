package dev.boundary.waters.FizzBuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {

	
	/**
	 * A canonical FizzBuzz implementation.
	 * 
	 * Write a program that prints the numbers from 1 to 100. 
	 * But for multiples of three print “Fizz” instead of the number.
	 * For the multiples of five print “Buzz”. 
	 * For numbers which are multiples of both three and five print “FizzBuzz”.
	 * 
	 */
	public static void fizzBuzz() {
		
		for(int i = 1; i < 101; i++) {
			boolean isFactorThree = ((i % 3) == 0);
			boolean isFactorFive = ((i % 5) == 0);
			
			if(isFactorThree && isFactorFive) {
				System.out.println("FizzBuzz");
			} else if(isFactorThree) {
				System.out.println("Fizz");
			} else if(isFactorFive) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}

		}		
	}
	
    /**
     * A main method to start this application.
     * The spring boot call is commented out for now.
     */
	
    public static void main(String[] args) {
        fizzBuzz();
        // SpringApplication.run(MySpringBootApplication.class, args);
    }

}
