package com.example.Integration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IntegrationApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("it is a test class");
		assertEquals(true,true);
	}

}
