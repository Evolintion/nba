package com.enesmumu.nba.platform.user.service;

import com.enesmumu.nba.base.IBaseService;
import com.enesmumu.nba.platform.user.pojo.User;

/**
 * 用户Service层接口
 * 
 * @author BoXuelin
 * @date 2017年10月18日
 * @version 1.0
 */
public interface IUserService extends IBaseService<User> {
	/**
	 * 注册用户
	 * 
	 * @return
	 */
	Boolean register(String name, String password);

}
