package com.example;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class DoMethodExtPoint {
    @Pointcut("@annotation(com.example.annotation.DoMethodExt)")
    public void aopPoint() {}

    @Around("aopPoint()")
    public Object doRoute(ProceedingJoinPoint jp) {
        return null;
    }

    private Method getMethod(JoinPoint jp) {
        Signature sig = jp.getSignature();
        MethodSignature methodSignature = (MethodSignature) sig;
        return null;
    }

    private Class<? extends Object> getClass(JoinPoint jp) throws NoSuchMethodException {
        return jp.getTarget().getClass();
    }


}
