package com.szabist.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

//
//	@Around("execution(* com.szabist.controller.StudentController.getStudents(..))")
//	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
//
//		System.out.println("This is log around method");
//		System.out.println("Method: " + joinPoint.getSignature().getName());
//		System.out.println("Arguments : " + Arrays.toString(joinPoint.getArgs()));
//		
//		System.out.println("Around before is running!");
//		joinPoint.proceed();
//		System.out.println("Around after is running!");
//		
//		System.out.println("******");
//
//	}
//	
//
//	@Before("execution(* com.szabist.controller.StudentController.getStudents(..))")
//	public void logBefore(JoinPoint joinPoint) {
//		System.out.println("This is log before method");
//		System.out.println("We are accessing the method before executiong");
//		System.out.println("Method name : " + joinPoint.getSignature().getName());
//		System.out.println("******");
//	}
}
