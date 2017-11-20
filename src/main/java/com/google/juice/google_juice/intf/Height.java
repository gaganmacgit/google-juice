package com.google.juice.google_juice.intf;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import com.google.inject.BindingAnnotation;

@BindingAnnotation
@Target({ PARAMETER, METHOD })
@Retention(RUNTIME)
public @interface Height {
}