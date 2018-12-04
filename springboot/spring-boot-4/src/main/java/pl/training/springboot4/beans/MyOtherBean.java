package pl.training.springboot4.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyOtherBean  {

    private MyBean myBean1;
    private MyBean myBean2;

    public MyOtherBean(MyBean myBean1, MyBean myBean2) {
        this.myBean1 = myBean1;
        this.myBean2 = myBean2;
    }

    @PostConstruct
    public void afterPropertiesSet() throws Exception {
        System.out.println(myBean1.getName());
        System.out.println(myBean2.getName());
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("Destroyed");
    }
}
