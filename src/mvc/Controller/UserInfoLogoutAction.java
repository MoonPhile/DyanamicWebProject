package mvc.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UserInfoLogoutAction implements Action{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("로그아웃 액션");
        HttpSession session = request.getSession();
        session.invalidate();
        response.sendRedirect("UserInfoLogin.jsp");
    }
}
