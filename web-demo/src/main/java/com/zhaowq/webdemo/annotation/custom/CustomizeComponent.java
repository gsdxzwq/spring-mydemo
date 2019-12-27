package com.zhaowq.webdemo.annotation.custom;

import java.lang.annotation.*;

/**
 * 1.定义一个注解，不再需要@Component
 *
 * @author zhaowq
 * @date 2019/6/11
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CustomizeComponent {
    String value() default "";
}
