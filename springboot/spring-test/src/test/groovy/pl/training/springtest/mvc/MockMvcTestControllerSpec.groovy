package pl.training.springtest.mvc

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import spock.lang.Shared
import spock.lang.Specification;

 class MockMvcTestControllerSpec extends Specification{

    @Shared
    MockMvc mockMvc

     def setupSpec(){
         mockMvc = MockMvcBuilders.standaloneSetup(new TestController()).build()
     }

     def "test mvc configuration"(){
         when:
         def response = mockMvc.perform(MockMvcRequestBuilders.get("/test/get")).andReturn().response

         then:
        response.status == 200
     }

     def "test post"(){
         given:
         ObjectMapper objectMapper = new ObjectMapper()

         MyBeanDTO myBeanDTO = new MyBeanDTO()
         def beanValue = 'post value'
         myBeanDTO.myValue = beanValue
         def dtoValue = objectMapper.writeValueAsString(myBeanDTO)

         when:
         def response = mockMvc.perform(post("/test/post")
         .content(dtoValue)
         .contentTyoe(MediaType.APPLICATION_JSON_UTF8))
         .andReturn().response

         def builder = post("/test/post")
         .content(dtoValue)
         .contentType(MediaType.APPLICATION_JSON_UTF8)

         then:
         response.status == 200
         mockMvc.perform().andReturn().response.getStatus() == 200

     }
}
