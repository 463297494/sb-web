package com.yx.mapper.base;

import java.util.List;

/**
 * CRUD操作父接口
 * 
 * @author bj
 *
 * @param <T>
 */
public interface BaseDao<T> {
	public Boolean insert(T value);

	public Boolean delete(T value);

	public Boolean update(T value);

	public List<T> select(T value);

	public List<T> select();
}
