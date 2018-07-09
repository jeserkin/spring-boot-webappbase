package com.artcoder.webappbase;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.h2.server.web.WebServlet;

@Configuration
public class BeanConfig {
  @Bean
  ServletRegistrationBean<WebServlet> h2servletRegistration() {
    ServletRegistrationBean<WebServlet> registrationBean = new ServletRegistrationBean<>(new WebServlet());
    registrationBean.addUrlMappings("/console/*");
    return registrationBean;
  }
}
