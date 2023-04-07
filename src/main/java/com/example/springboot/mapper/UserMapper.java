package com.example.springboot.mapper;

import com.example.springboot.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liuxiang
 * @since 2023-01-19
 */
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from sys_user where user_id=#{id}")
    User getUser(Integer id);

    @Update("UPDATE  sys_user SET password = #{arg0} WHERE username=#{arg1}")
    void changePwd(String password,String name);
}
