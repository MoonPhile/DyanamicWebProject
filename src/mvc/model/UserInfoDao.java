package mvc.model;

import java.util.List;

public interface UserInfoDao {
    List<UserInfo> selectList()throws Exception;
    int insert(UserInfo userInfo)throws Exception;
    int delete(String id)throws Exception;
    UserInfo selectOne(String id)throws Exception;
    int update(UserInfo userInfo)throws Exception;
    UserInfo exist(String id,String password)throws Exception;
}
