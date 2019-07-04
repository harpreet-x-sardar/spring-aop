package com.harpreet.aop.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAspect {

//    @Before("execution(* com.harpreet.aop.example.*.*.*(..))") // same thing done with point cuts at one file
    @Before("com.harpreet.aop.example.aspects.OneFileForCommonJoinPoints.trackAllCallsInThisPackageAndSubPackages()")
    public void logBeforeEveryCall(JoinPoint joinPoint){
        System.out.println("BEFORE  get written to console per call "+joinPoint.getSignature().getName());
    }

    @After("execution(* com.harpreet.aop.example.*.*.*(..))")
    public void logAfterEveryCall(JoinPoint joinPoint){
        System.out.println("AFTER  get written to console per call "+joinPoint.getSignature().getName());
    }


    @Around("execution(* com.harpreet.aop.example.*.*.*(..))")
    public Object logAspectEveryCall(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("Logging aspect---------- "+joinPoint.getSignature().getName());
        Object proceed = joinPoint.proceed();
        System.out.println("Logging aspect---------- "+joinPoint.getSignature().getName());
        return proceed;
    }
}
