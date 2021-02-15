package dev.boundary.waters.FizzBuzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {

	
	
    /**
     * A main method to start this application.
     * The spring boot call is commented out for now.
     */
	
    public static void main(String[] args) {
    	FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz(1, 101, System.out::println);
        // SpringApplication.run(MySpringBootApplication.class, args);
    }

}
