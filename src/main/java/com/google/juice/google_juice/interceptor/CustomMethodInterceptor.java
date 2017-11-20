package com.google.juice.google_juice.interceptor;

import java.util.logging.Logger;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CustomMethodInterceptor implements MethodInterceptor {


	public CustomMethodInterceptor() {
	}

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String className = methodInvocation.getClass().getName();
		String methodName = methodInvocation.getMethod().getName();
		Object[] arguments = methodInvocation.getArguments();
		for (Object arg : arguments) {
			System.out.println("Class name=> " + className + " Method name =>" + methodName + " Argument is => " + arg);
		}
		return methodInvocation.proceed();
	}
}
