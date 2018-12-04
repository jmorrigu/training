package pl.training.springtest.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class MyBean {

    private MyOtherBean myOtherBean;
    private String myValue;

    public MyBean() {
    }

    public MyBean(MyOtherBean myOtherBean) {
        this.myOtherBean = myOtherBean;
    }

    public MyBean(MyOtherBean myOtherBean, String myValue) {
        this.myOtherBean = myOtherBean;
        this.myValue = myValue;
    }
}
