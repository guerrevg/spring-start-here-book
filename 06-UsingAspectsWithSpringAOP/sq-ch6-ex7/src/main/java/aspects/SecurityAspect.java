package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.logging.Logger;

@Aspect
@Order(1) // gives an execution order position to the aspect
public class SecurityAspect {

    Logger logger = Logger.getLogger(SecurityAspect.class.getName());

    @Around(value = "@annotation(ToLog)")
    public Object secure(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Security aspect: Calling the intercepted method");

        Object returnedValue = joinPoint.proceed();

        logger.info("Security aspect: Method executed and returned: " + returnedValue);

        return returnedValue;
    }
}
