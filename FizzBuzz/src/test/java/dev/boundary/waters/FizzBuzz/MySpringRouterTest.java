package dev.boundary.waters.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@CamelSpringBootTest
class MySpringRouterTest  {

	@Autowired
    protected CamelContext camelContext;
	
	@Autowired
	private ProducerTemplate producerTemplate;

	@Test
	void test() throws Exception {
		// invoking consumer
		producerTemplate.sendBodyAndHeader("direct:fizzbuzz", null, "i", "15");
		
		Object o = producerTemplate.requestBodyAndHeader("direct:fizzbuzz", null, "i", "15");
		assertEquals("FizzBuzz", o);
		o = producerTemplate.requestBodyAndHeader("direct:fizzbuzz", null, "i", "1");
		assertEquals("1", o);
		o = producerTemplate.requestBodyAndHeader("direct:fizzbuzz", null, "i", "3");
		assertEquals("Fizz", o);
	}
}
