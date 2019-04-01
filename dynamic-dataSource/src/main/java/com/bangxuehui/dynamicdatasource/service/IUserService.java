package com.bangxuehui.dynamicdatasource.service;

import com.bangxuehui.dynamicdatasource.entity.User;

import java.util.List;

/**
 * 接口
 *
 * @author yw
 * @date 2019/4/1
 */
public interface IUserService {

    void insertUser(User user);

    List<User> selectUserList();
}
