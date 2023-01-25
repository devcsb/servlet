package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/* // @Controller 대신 아래와 같이 두 어노테이션의 조합으로도 자동 등록이 가능하다.
@Component          RequestMappingHandlerMapping 은 스프링 빈 중에서 @RequestMapping 또는 @Controller 가
@RequestMapping     클래스 레벨에 붙어 있는 경우에 매핑 정보로 인식하기 때문.
*/

@Controller // 1. 내부에 @Component 가 있으므로, 컴포넌트 스캔의 대상이 됨. 2.스프링 MVC에서 애노테이션 기반 컨트롤러로 인식함.
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}

