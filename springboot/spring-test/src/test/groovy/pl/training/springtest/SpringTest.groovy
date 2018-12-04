package pl.training.springtest

import org.springframework.test.context.TestPropertySource

import java.lang.annotation.*

@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.TYPE])
@Inherited
@TestPropertySource('/my.properties')
@interface SpringTest {

}
