package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response); // redirect는 클라이언트로 응답이 나갔다가 다시 호출하는 것. foward는 서버 내부에서의 호출.

        /*
        dispatcher.forward() : 다른 서블릿이나 JSP로 이동할 수 있는 기능. 서버 내부에서 다시 호출이 발생한다.
       /WEB-INF 안에 있는 자원은 외부에서 호출 할 수 없다. WAS의 기본 룰. 항상 컨트롤러를 통해 jsp를 호출하기 위해, WEB-INF 하위에 JSP 파일을 위치한다.
      */
    }
}
