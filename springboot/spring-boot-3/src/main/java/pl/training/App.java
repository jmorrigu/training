package pl.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.training.beans.MyBean;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        MyBean myBean = context.getBean("myBean", MyBean.class);
        myBean.sayHello();

    }

}
