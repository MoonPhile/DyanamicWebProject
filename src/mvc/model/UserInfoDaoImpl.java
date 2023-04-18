package mvc.model;

import mvc.database.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserInfoDaoImpl implements UserInfoDao {
    public UserInfo selectOne(String id) throws Exception {
        Connection conn = DBConnection.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        UserInfo userInfo = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("Select ID, PW, NAME from userinfo where = '" + id + "'");
            if (rs.next()) {
                userInfo = new UserInfo().setId(rs.getString("id"))
                        .setPw(rs.getString("PW"))
                        .setName(rs.getString("name"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
        return userInfo;
    }

    public UserInfo exist(String id, String password) throws Exception {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        UserInfo userInfo = null;
        try {
            pstmt = conn.prepareStatement("select  id,pw,name from userinfo where id=? and pw=?");
            pstmt.setString(1, id);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                userInfo = new UserInfo().setId(rs.getString(1))
                        .setPw(rs.getString(2))
                        .setName(rs.getString(3));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
        return userInfo;
    }


    public int insert(UserInfo userInfo) throws Exception {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement("insert into userinfo(id,pw,name) values (?,?,?)");
            pstmt.setString(1, userInfo.getId());
            pstmt.setString(2, userInfo.getPw());
            pstmt.setString(3, userInfo.getName());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
    }

    public int update(UserInfo userInfo) throws Exception {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement("update userinfo set pw=?, name=? where id=?");
            pstmt.setString(1, userInfo.getPw());
            pstmt.setString(2, userInfo.getName());
            pstmt.setString(3, userInfo.getId());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
    }

    public int delete(String id) throws Exception {
        Connection conn = DBConnection.getConnection();
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            return stmt.executeUpdate("delete from userinfo where id ='" + id + "'");
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public List<UserInfo> selectList() throws Exception {
        Connection conn = DBConnection.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<UserInfo> userInfos = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select id,pw,name from userinfo order by name asc");
            userInfos = new ArrayList<UserInfo>();
            while (rs.next()) {
                userInfos.add(new UserInfo().setId(rs.getString("id")).setPw(rs.getString("pw")).setName(rs.getString("name")));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
            }
        }
        return userInfos;
    }
}
