package com.seleniumTest;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pack2.User;



public class JacksonAPITest {

	@Test
	public void testAPIAttribute () throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper objectMapper = new ObjectMapper ();
		File a = new File ("C:/users/chandansharma/workspace/ApiTesting/src/com/seleniumTest/jsonexample.json");
		User user = objectMapper.readValue(a, User.class);
		
		assert user.getAge().equals(25): "User age is wrong";
		assert user.getNumber().size() == 2: "Not all numbers available";
		
			
	}
}
