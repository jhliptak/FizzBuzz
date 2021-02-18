package dev.boundary.waters.FizzBuzz;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * A simple Camel route that triggers from a timer and calls a bean and prints to system out.
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@Component
public class MySpringBootRouter extends RouteBuilder {
	
	@Autowired
	FizzBuzz fb;

    @Override
    public void configure() {
    	
    	restConfiguration().component("netty-http").host("0.0.0.0").port(8888).bindingMode(RestBindingMode.json);
    	        
        rest("/camel").get("/hello/{i}").to("direct:fizzbuzz");
        
        from("direct:fizzbuzz").bean(fb, "process(${header.i})");
        
        // Needed for auto generated unit test only
        from("timer:hello?period={{timer.period}}").routeId("hello")
        .transform().method("myBean", "saySomething")
        .filter(simple("${body} contains 'foo'"))
            .to("log:foo")
        .end()
        .to("stream:out");

    }

}
