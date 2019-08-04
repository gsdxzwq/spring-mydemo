package com.zhaowq.springmvcinaction.aop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhaowq
 * @date 2019/6/5
 */
@Controller
public class TestController {
    @RequestMapping("/test.html")
    public ModelAndView handleRequest(){
        System.out.println("---------TestController executed--------");
        return new ModelAndView("test");
    }
}
