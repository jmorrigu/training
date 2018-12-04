package pl.training.springboot4.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MyBean  {
    // zostanie stworzony bean myBean w Spring Context

    private String name = "default";

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {

    }
}
