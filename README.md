# web-app-base
This project is intended to cover few most popular ways _(authors opinion)_ on how to use Spring Boot for web applications. Those steps will use different 
approaches and technologies.

## Project contents
Technologies used in general:
- Spring Boot
- H2
- JPA
- Gradle

---

- [Basic rest application](https://github.com/jeserkin/spring-boot-webappbase/tree/base)

- [Application with Thymeleaf support](https://github.com/jeserkin/spring-boot-webappbase/tree/thymeleaf)
  - Technologies used in addition to general list:
    - Thymeleaf
    
- [Application with Thymeleaf and Rest support](https://github.com/jeserkin/spring-boot-webappbase/tree/thymeleaf-rest)
  - Technologies used in addition to general list:
    - Thymeleaf
  - Approach used:
    - Async requests for data, to lessen the initial response payload from server