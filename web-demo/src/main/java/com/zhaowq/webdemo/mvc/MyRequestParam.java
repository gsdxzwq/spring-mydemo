package com.zhaowq.webdemo.mvc;

import java.lang.annotation.*;

/**
 * @author zhaowq
 * @Date 2018/8/18
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {
    String value() default "";
}
