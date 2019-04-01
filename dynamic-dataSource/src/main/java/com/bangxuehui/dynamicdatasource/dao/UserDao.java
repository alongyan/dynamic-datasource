package com.bangxuehui.dynamicdatasource.dao;

import com.bangxuehui.dynamicdatasource.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 持久层DAO
 *
 * @author yw
 * @date 2019/4/1
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

    List<User> selectList(Wrapper<User> wrapper);

    @Insert("INSERT INTO user   ( `name`,age, email)  VALUES   (#{name},#{age},#{email})")
    Integer insertAllColumn(User user);


}
