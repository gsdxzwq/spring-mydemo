package com.zhaowq.springmvcinaction.aop;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhaowq
 * @date 2019/6/5
 */
public class TestFilter2 extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        System.out.println("############TestFilter2 doFilterInternal executed############");
        filterChain.doFilter(request, response);
        System.out.println("############TestFilter2 doFilter after############");
    }
}
