package comgreenfoxacademy.gfwebshop.controllers;

import comgreenfoxacademy.gfwebshop.GfwebshopApplication;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import comgreenfoxacademy.gfwebshop.models.Clothes;
import comgreenfoxacademy.gfwebshop.models.Response;
import comgreenfoxacademy.gfwebshop.service.ClothesService;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.junit.Test;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GfwebshopApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class StoreRestControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void shouldReturnOneOfTheItemCategoryFromTheResultList() throws Exception {
    String status = "ok";
    List<Clothes> testList1 = new ArrayList<>();
    Clothes testClothes1 = new Clothes(16, "Strecth Steamed Pencil Skirt",
            "Calvin Klein", "skirts", "s", 39 );
    Clothes testClothes2 = new Clothes(18, "Strecth Steamed Pencil Skirt",
            "Calvin Klein", "skirts", "m", 39 );
    testList1.add(testClothes1);
    testList1.add(testClothes2);

    mockMvc.perform(
            get("/warehouse/query?price=39&type=equal")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result",is(status)))
            .andExpect(jsonPath("$.clothes.[0].category", is(testList1.get(0).getCategory())));

  }

  @Test
  public void shouldReturnEmptyResultList() throws Exception {
    String status = "ok";
    List<Clothes> testList2 = new ArrayList<>();
    mockMvc.perform(
            get("/warehouse/query?price=120&type=higher")
            )
            .andExpect(status().isOk())
            .andExpect(content().contentType("application/json;charset=UTF-8"))
            .andExpect(jsonPath("$.result", is(status)))
            .andExpect(jsonPath("$.clothes", is(testList2)));
  }
}