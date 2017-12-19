package org.yangjie.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.yangjie.entity.User;

public interface UserDao {
    int deleteById(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectById(Integer userid);

    int updateByIdSelective(User record);

    int updateById(User record);
    
    // 以上为mybatis generator自动生成接口, 具体实现在mapper.xml中
    
    // 以下方法使用mybatis注解实现
    
    @Select("select * from user where username=#{username} and password=#{password}")
    User selectByUsernameAndPassword(@Param("username")String username, @Param("password")String password);
}