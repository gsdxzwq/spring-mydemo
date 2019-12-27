package com.zhaowq.webdemo.annotation.common;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 * @author zhaowq
 * @date 2019/6/11
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyComponent {
    String value() default "";
}
