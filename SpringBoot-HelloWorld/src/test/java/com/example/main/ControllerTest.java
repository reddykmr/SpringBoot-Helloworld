package com.example.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ControllerTest extends SpringBootHelloWorldApplicationTests {
	@Autowired
	private WebApplicationContext context;

	private MockMvc mockMvc;

	ObjectMapper om = new ObjectMapper();

	@Before
	public void SetUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	/*
	 * @Test public void test() throws Exception {
	 * mockMvc.perform(get("/hello").content(MediaType.APPLICATION_JSON_VALUE))
	 * .andExpect(MockMvcResultMatchers.status().isOk())
	 * .andExpect(MockMvcResultMatchers.content().string("hello!!"));
	 * 
	 * }
	 * 
	 * @Test public void testEmp() throws Exception {
	 * mockMvc.perform(get("/get").content(MediaType.APPLICATION_JSON_VALUE))
	 * .andExpect(MockMvcResultMatchers.status().isOk()).andExpect(jsonPath("$.id",
	 * Matchers.is("100"))) .andExpect(jsonPath("$.name", Matchers.is("mahesh")));
	 * 
	 * 
	 * 
	 * }
	 */

}
