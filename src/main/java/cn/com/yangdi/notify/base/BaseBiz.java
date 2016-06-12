package cn.com.yangdi.notify.base;

import java.io.Serializable;

import org.springframework.transaction.annotation.Transactional;

public abstract class BaseBiz<T, ID extends Serializable> {

	public abstract BaseDao<T, ID> getBaseDao();

	@Transactional(readOnly = true)
	public T find(ID id) {
		return getBaseDao().find(id);
	}
	
	@Transactional
	public T save(T entity){
		return getBaseDao().save(entity);
	}
}
