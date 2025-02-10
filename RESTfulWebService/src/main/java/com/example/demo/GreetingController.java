package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * the controller will ensure that the class will control how the object will be
 * used it is done using 2 parts. 1.get mapping 2.request param
 **/
@RestController
public class GreetingController {
	/*
	 * s is a placeholder of the run-time value if user inputs abcd, output will be
	 * hello abcd
	 */
	private static final String template = "Hello, %s!";
	private final AtomicLong atomicLong = new AtomicLong();// atomic long is a datatype that will handle huge data

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(atomicLong.incrementAndGet(), String.format(template, name));
	}

}
