import pl.training.springtest.bean.MyBean
import pl.training.springtest.bean.MyOtherBean

beans {
    myOtherBean(MyOtherBean)
    myBean(MyBean){
        myValue ='groovy value'
    }
}
