package pl.training.springtest.bean;

import lombok.Data;

@Data
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
