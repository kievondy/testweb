package com.test.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	Random random;

	public TestService() {
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");
		System.out.println("**************************************************");
	}

	public String getString() {
		return String.valueOf(random.nextInt());
	}

}
