package pl.training.springtest.bean

import org.springframework.context.support.GenericApplicationContext
import org.springframework.test.context.TestContext
import org.springframework.test.context.TestExecutionListener

class MyTestExecutionListener implements TestExecutionListener {

    @Override
    void beforeTestClass(TestContext testContext) throws Exception{

        MyBean myBean = new MyBean()
        GenericApplicationContext context = testContext.applicationContext as GenericApplicationContext
        context.getBean(myBean)
    }
}
