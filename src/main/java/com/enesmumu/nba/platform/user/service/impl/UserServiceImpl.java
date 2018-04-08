package com.enesmumu.nba.platform.user.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.enesmumu.nba.platform.user.dao.IUserDao;
import com.enesmumu.nba.platform.user.pojo.User;
import com.enesmumu.nba.platform.user.service.IUserService;

/** 
 * 用户实现类
 * @author BoXuelin
 * @date 2017年10月18日 
 * @version 1.0 
 */
@Service("user")
public class UserServiceImpl implements IUserService{
	@Resource
	private IUserDao userDao;

	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	@Override
	public User getById(Long id) {
		return this.userDao.getById(id);
	}
	
	/**
	 * 根据id集合查询
	 * @param ids
	 * @return
	 */
	@Override
	public List<User> findByIds(List<Long> list) {
		return this.userDao.findByIds(list);
	}

	/**
	 * 根据多重条件查询
	 * @param params
	 * @return
	 */
	@Override
	public List<User> findByParams(Map params) {
		return this.userDao.findByParams(params);
	}

	/**
	 * 单个添加
	 * @param bean
	 */
	@Override
	public Integer insert(User bean) {
		return this.userDao.insert(bean);
	}

	/**
	 * 批量添加
	 * @param bean
	 */
	@Override
	public Integer insertList(List<User> list) {
		return this.userDao.insertList(list);		
	}

	/**
	 * 单个修改
	 * @param bean
	 */
	@Override
	public Integer update(User bean) {
		return this.userDao.update(bean);
	}

	/**
	 * 批量修改
	 * @param list
	 */
	@Override
	public Integer updateList(List<User> list) {
		return this.userDao.updateList(list);
	}
	
	/**
	 * 根据id单个删除
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Integer delete(Long id,Long userId) {
		User bean=this.getById(id);
		return this.userDao.update(bean);
	}

	/**
	 * 根据集合删除
	 * 
	 * @param ids
	 * @return
	 */
	@Override
	public Integer deleteList(List<Long> list,Long userId) {
		List<User> alList=this.findByIds(list);
		for(User bean:alList) {
		}
		return this.userDao.updateList(alList);
	}
	/***************************************************************************************************************************/
	

	@Override
	public Boolean register(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
