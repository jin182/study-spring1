package com.example.filter.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Component
public class OpenApiInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("preHandle");
        if (handler instanceof HandlerMethod handlerMethod) {
            OpenApi methodLevel = handlerMethod.getMethodAnnotation(OpenApi.class);
            if (methodLevel != null) {
                log.info("method Level");
                return true;
            }
            OpenApi classLevel = handlerMethod.getBeanType().getAnnotation(OpenApi.class);
            if (classLevel != null) {
                log.info("class Level");
                return true;
            }
        }
        log.info("Open Api 아닙니다 : {}", request.getRequestURI());
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("post handle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("after completion");
    }
}