package com.enesmumu.nba.base;

import java.util.List;
import java.util.Map;

/**
 * @author BoXuelin
 * @date 2017年10月18日
 * @version 1.0
 */
public interface IBaseDao<T> {
	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public T getById(Long id);

	/**
	 * 根据集合查询
	 * 
	 * @param ids
	 * @return
	 */
	public List<T> findByIds(List<Long> list);

	/**
	 * 根据多重条件查询
	 * 
	 * @param params
	 * @return
	 */
	public List<T> findByParams(Map params);

	/**
	 * 单个添加
	 * 
	 * @param bean
	 */
	public Integer insert(T bean);

	/**
	 * 批量添加
	 * 
	 * @param bean
	 */
	public Integer insertList(List<T> list);

	/**
	 * 单个修改
	 * 
	 * @param bean
	 */
	public Integer update(T bean);

	/**
	 * 批量修改
	 * 
	 * @param list
	 */
	public Integer updateList(List<T> list);

	/**
	 * 根据id单个删除
	 * 
	 * @param id
	 * @return
	 */
	public Integer delete(Long id);

	/**
	 * 根据集合删除
	 * 
	 * @param ids
	 * @return
	 */
	public Integer deleteList(List<Long> list);
}
