package cn.edu.zucc.mapper;

import cn.edu.zucc.pojo.TbUserEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by shentao on 2016/7/4.
 */

@Repository
public interface UserMapper {

    /**
     * 通过ID查询单个用户
     *
     * @param id
     * @return
     */
    TbUserEntity queryById(@Param("user_id")long id);


    /**
     * 通过acount查询单个用户
     * @param userAcount
     * @return
     */
    TbUserEntity queryByAcount(@Param("user_acount")String userAcount);


    /**
     * 查询在数据库里是否有此账号密码的用户
     * @param userAcount
     * @param pwd
     */
    TbUserEntity selectUser(@Param("user_acount")String userAcount, @Param("user_pwd")String pwd);
}
