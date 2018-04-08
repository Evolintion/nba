package com.enesmumu.nba.platform.user.dao;

import org.springframework.stereotype.Repository;

import com.enesmumu.nba.base.IBaseDao;
import com.enesmumu.nba.platform.user.pojo.User;

/**
 * 用户DAO层接口
 * 
 * @author BoXuelin
 * @date 2017年10月18日
 * @version 1.0
 */
@Repository
public interface IUserDao extends IBaseDao<User> {
}