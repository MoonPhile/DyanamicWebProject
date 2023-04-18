package mvc.Controller;

import mvc.model.UserInfo;
import mvc.model.UserInfoDao;
import mvc.model.UserInfoDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class UserInfoAddAction implements Action {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            UserInfoDao userInfoDao = new UserInfoDaoImpl();
            userInfoDao.insert(new UserInfo().setId(request.getParameter("id")).setPw(request.getParameter("pw")).setName(request.getParameter("name")));
            response.sendRedirect("ControllerServlet?command=list");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
