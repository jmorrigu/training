package pl.training.beans;

import pl.training.interfaces.MyInterface;

public class MyBean {

    private MyInterface myInterface;

    public void sayHello(){
        myInterface.sayHello();
    }

    public void setMyInterface(MyInterface myInterface) {
        this.myInterface = myInterface;
    }
}
