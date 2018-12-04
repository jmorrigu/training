package pl.training.springtest.bean

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(classes = [MyBean])
class BasicContextConfigurationSpec extends Specification {

    @Autowired
    MyBean myBean

    def "check context"(){
        expect:
        myBean
    }

    @TestConfiguration
    @ComponentScan("pl.training.springtest.bean")
    static class BasicConfiguration{

    }


}
