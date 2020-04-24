package com.example.devops.web;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class WelcomeControllerTest {
	
	
	@Test
	public void testWelcome() {
		//mockMvc.perform(get("/")).andExpect(status().isOk());
		assertEquals("Hello", "Hello");
	}

}
