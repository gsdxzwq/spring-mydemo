package com.zhaowq.webdemo.mvc;

import java.lang.annotation.*;

/**
 * @author zhaowq
 * @date 2018/8/18
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {
    String value() default "";
}
