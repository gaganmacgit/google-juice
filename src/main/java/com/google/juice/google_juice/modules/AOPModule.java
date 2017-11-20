package com.google.juice.google_juice.modules;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import com.google.juice.google_juice.annotation.MethodLoggingAnnotator;
import com.google.juice.google_juice.interceptor.CustomMethodInterceptor;

public class AOPModule extends AbstractModule {

	public AOPModule() {
	}

	@Override
	protected void configure() {
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(MethodLoggingAnnotator.class),
				new CustomMethodInterceptor());
	}

}
