package mvc.Controller;

import mvc.model.UserInfo;
import mvc.model.UserInfoDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class UserInfoLoginAction implements Action{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("로그인 액션");
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        HttpSession session = request.getSession();
        try {
            UserInfo userInfo = new UserInfoDaoImpl().exist(id,pw);
            if(userInfo!=null) {
                session.setAttribute("userInfo", userInfo);
                response.sendRedirect("ControllerServlet?command=list");
            }else {
                response.sendRedirect("LoginFailed.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
