package com.example.greenfoxacademy.restbegin.controllers;

import com.example.greenfoxacademy.restbegin.RestbeginApplication;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestbeginApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class RestBeginControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testIfTheInputGetDoubled() throws Exception {
    mockMvc.perform(
            get("/doubling?input=15")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.received", is(15)))
            .andExpect(jsonPath("$.result", is(30)));
  }

  @Test
  public void testTheGreeterValues() throws Exception {
    String name = "sanyi";
    String title = "mr";
    mockMvc.perform(
            get ("/greeter?name=sanyi&title=mr")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.welcome_message",
                    is("Oh, hi there " + name + ", my dear " + title + "!")));
  }

  @Test
  public void testTheAppendEndpoint() throws Exception {
    String appendable = "furuly";
    String appender = "a";
    mockMvc.perform(
            get("/appenda/furuly")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.appended", is(appendable + appender)));
  }

  @Test
  public void testTheSumOperation() throws Exception {
    int until = 8;
    int result = 36;
    mockMvc.perform(
            post("/dountil/sum")
            .contentType("application/json;charset=UTF-8")
            .content({"\"until\": 8}")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.until", is()));
  }

}