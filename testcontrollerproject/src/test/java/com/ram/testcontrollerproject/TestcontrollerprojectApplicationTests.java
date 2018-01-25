package com.ram.testcontrollerproject;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TestcontrollerprojectApplicationTests {
		@Autowired
		private MockMvc mockMvc;

		public static final String RESULT = "Ram Jet";	

	    @Test
	    public void testCreationOfANewProjectSucceeds() throws Exception {
	        System.out.println("start");
	        mockMvc.perform(get("/jet/type").accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().string(RESULT));
	        System.out.println("end");
	      
	    }


}
