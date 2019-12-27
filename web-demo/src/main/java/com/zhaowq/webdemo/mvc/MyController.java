package com.zhaowq.webdemo.mvc;

import java.lang.annotation.*;

/**
 * @author zhaowq
 * @Date 2018/8/18
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {

    /**
     * 表示给controller注册别名
     *
     * @return
     */
    String value() default "";
}
