package pl.training.springboot51.rest.configuration;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class TimeBaseAcceptInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Date currentDate = new Date();

        if(currentDate.getHours() < 18){
            return false;
        } else if (currentDate.getHours() > 10 ){
            return false;
        }
        return true;
    }
}
