package pl.training.springtest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import pl.training.springtest.bean.MyBean
import spock.lang.Specification

@ContextConfiguration(classes = SpringTestApplication)
class SpringTestApplicationSpec extends Specification{

    @Autowired
    MyBean myBean

    def "check context"(){
        expect:
        myBean
    }
}
