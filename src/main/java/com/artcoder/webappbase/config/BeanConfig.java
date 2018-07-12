package com.artcoder.webappbase.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

@Configuration
public class BeanConfig {
  @Bean
  ServletRegistrationBean<WebServlet> h2servletRegistration() {
    ServletRegistrationBean<WebServlet> registrationBean = new ServletRegistrationBean<>(new WebServlet());
    registrationBean.addUrlMappings("/console/*");
    return registrationBean;
  }

  @Bean
  public IDialect conditionalCommentDialect() {
    return new Java8TimeDialect();
  }
}
