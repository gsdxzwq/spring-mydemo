package com.zhaowq.webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 1.Java 注解编程模型
 * 1.1. 最经典的 Hello World 的示例
 *
 * @author zhaowq
 * @date 2019/6/17
 */
@RestController
public class BasicController {

    @GetMapping("/hello_world")
    public Mono<String> sayHelloWorld() {
        return Mono.just("Hello World");
    }
}
