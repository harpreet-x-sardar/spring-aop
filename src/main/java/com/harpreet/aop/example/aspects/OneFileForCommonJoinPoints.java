package com.harpreet.aop.example.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class OneFileForCommonJoinPoints {

//    @Pointcut("execution(* com.in28minutes.spring.aop.springaop.data.*.*(..))")
//    public void dataLayerExecution(){}
//
//    @Pointcut("execution(* com.in28minutes.spring.aop.springaop.business.*.*(..))")
//    public void businessLayerExecution(){}
//
//    @Pointcut("dataLayerExecution() && businessLayerExecution()")
//    public void allLayerExecution(){}
//
//    @Pointcut("bean(*dao*)")
//    public void beanContainingDao(){}
//
//    @Pointcut("within(com.in28minutes.spring.aop.springaop.data..*)")
//    public void dataLayerExecutionWithWithin(){}
//
//    @Pointcut("@annotation(com.in28minutes.spring.aop.springaop.aspect.TrackTime)")
//    public void trackTimeAnnotation(){}


    @Pointcut("execution(* com.harpreet.aop.example.*.*.*(..))")
    public void trackAllCallsInThisPackageAndSubPackages(){}

    @Pointcut("@annotation(com.harpreet.aop.example.aspects.LogExecutionTime)")
    public void trackTimeAnnotation(){}
}
