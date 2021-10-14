package com.mk.rev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ReverseAPI.class)
class RevApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnReverseString() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/v1/rev/123/");
        MvcResult mvcResult = mockMvc.perform(requestBuilder).andReturn();
        Assertions.assertEquals("321", mvcResult.getResponse().getContentAsString());
    }

}
