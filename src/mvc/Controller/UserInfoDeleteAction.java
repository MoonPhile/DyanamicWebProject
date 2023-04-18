package mvc.Controller;

import mvc.model.UserInfoDao;
import mvc.model.UserInfoDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserInfoDeleteAction implements Action{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("딜리트 액션");
        try {
            UserInfoDao userInfoDao = new UserInfoDaoImpl();
            userInfoDao.delete(request.getParameter("id"));
            response.sendRedirect("ControllerServlet?command=list");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
