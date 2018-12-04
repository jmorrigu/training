package pl.training.beans;

import pl.training.interfaces.MyInterface;

public class MyInterfaceImpl  implements MyInterface {

    public void sayHello() {
        System.out.println("Hello interface!");
    }
}
