package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan // 서블릿 자동 등록
@SpringBootApplication
public class ServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletApplication.class, args);
    }

/*	스프링 부트는 InternalResourceViewResolver 라는 뷰 리졸버를 자동으로 등록하는데, 이때
	application.properties 에 등록한 spring.mvc.view.prefix , spring.mvc.view.suffix 설정
	정보를 사용해서 등록한다. */
//    @Bean
//    ViewResolver internalResourceViewResolver() {
//        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
//    }
}
