package cn.com.yangdi.notify.base;

import java.io.Serializable;

public interface BaseDao<T, ID extends Serializable>  {
	
	public T find(ID id) ;
	
	public T save(T entity);
}
