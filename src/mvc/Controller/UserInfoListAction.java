package mvc.Controller;

import mvc.model.UserInfo;
import mvc.model.UserInfoDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserInfoListAction implements Action{
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("리스트 액션");
        try {
            List<UserInfo> userInfos = new UserInfoDaoImpl().selectList();
            request.setAttribute("userInfos",userInfos);
            request.getRequestDispatcher("UserInfoList.jsp").include(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
