/**
 * 
 */
package com.demo.loggingAdvice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Arbind Negi 10-Oct-2021
 *
 */

@Aspect
@Component
public class LoggingAdvice {
    Logger log = LoggerFactory.getLogger(LoggingAdvice.class);
	
	@Pointcut(value="execution(* com.demo.*.*.*(..) )")
	public void pointcutForExecution() {
		
	}
	
	@Around("pointcutForExecution()")
	public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		// Injecting the executing Method Name
		String methodName = pjp.getSignature().getName();
		
		// Injecting the executing Class Name
		String className = pjp.getTarget().getClass().toString();
		
		// Injecting the incoming requests or API calls at runtime
		Object[] array = pjp.getArgs();
		log.info("method invoked " + className + " : " + methodName + "()" + " arguments : "
				+ mapper.writeValueAsString(array));
		Object object = pjp.proceed();
		log.info(className + " : " + methodName + "()" + " Response : "
				+ mapper.writeValueAsString(object));
		return object;
	}
}
