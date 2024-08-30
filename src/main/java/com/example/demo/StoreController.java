package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class StoreController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
    
	@GetMapping("/store")
	public Store store(@RequestParam(value = "name", defaultValue = "World") String name, @RequestParam(value = "address", defaultValue = "World") String address) {
		return new Store("0001", name, address);
	}
}
