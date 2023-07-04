package com.dolla.daggertutorialhamalawy.autoDI;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

/**
 * @author adell
 * @created 03/07/2023 - 6:24 PM
 * @project DaggerTutorialHamalawy
 */

@Qualifier
@Documented
@Retention(RUNTIME)
public @interface Milk {

    String value() default "milk";
}