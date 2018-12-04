package pl.training.springboot4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.training.springboot4.annotations.Precious;
import pl.training.springboot4.beans.MyBean;
import pl.training.springboot4.beans.MyOtherBean;

@Configuration
public class MyConfiguration {

    @Bean
    @Precious
    public MyBean myPreciousBean(){         // nazwa beana dodangego do context będzie myPreciousBean
        MyBean myBean = new MyBean();
        myBean.setName("precious");
        return myBean;
    }

    @Bean
    public MyOtherBean myOtherBean(MyBean myBean, @Precious MyBean myPreciousBean){
//        MyBean myBean1 = myPreciousBean();  // MyBean będzie singletonem
//        MyBean myBean2 = myPreciousBean();  // ta sama referencja przypisana w 2 miejscach
        return new MyOtherBean(myBean, myPreciousBean);
    }

}
