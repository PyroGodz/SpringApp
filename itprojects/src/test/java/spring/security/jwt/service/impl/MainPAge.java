package spring.security.jwt.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MainPAge
{

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void LoadUser() throws Exception
    {
        mockMvc.perform(post("/users")).andDo(print()).andExpect(status().is2xxSuccessful());
    }

    @Test
    public void loadMainPage() throws Exception
    {
        mockMvc.perform(get("/")).andDo(print()).andExpect(status().is2xxSuccessful()); }
}