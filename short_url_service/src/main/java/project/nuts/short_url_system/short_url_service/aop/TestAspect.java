package project.nuts.short_url_system.short_url_service.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Aspect
@Component
public class TestAspect {

    @Before("@annotation(project.nuts.short_url_system.short_url_service.aop.TestAnnotation)")
    public void before(JoinPoint point){


        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
        String authorization = requestAttributes.getRequest().getHeader("Authorization");
        System.out.println("joint");
    }
}
