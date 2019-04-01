package com.bangxuehui.dynamicdatasource.service.impl;

import com.bangxuehui.dynamicdatasource.service.IUserService;
import com.bangxuehui.dynamicdatasource.annotation.DataSource;
import com.bangxuehui.dynamicdatasource.config.DataSourceNames;
import com.bangxuehui.dynamicdatasource.dao.UserDao;
import com.bangxuehui.dynamicdatasource.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 接口实现类
 *
 * @author yw
 * @date 2019/4/1
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserDao userDao;

    /**
     * 动态数据源：mysql主从应用，读从库，写主库
     */
    @Override
    @DataSource(name = DataSourceNames.MASTER)
    public void insertUser(User user) {
        userDao.insertAllColumn(user);
    }

    /**
     * 动态数据源：mysql主从应用，读从库，写主库
     */
    @Override
    @DataSource(name = DataSourceNames.SLAVE)
    public List<User> selectUserList() {
        return userDao.selectList(null);
    }
}
