package cn.com.yangdi.notify.base;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import cn.com.yangdi.notify.model.Account.Audience;

public abstract class BaseDaoImpl<T, ID extends Serializable> implements BaseDao<T, ID > {

	
	
	public abstract SessionFactory  getSessionFactory();
	
	private Class<T> entityClass;
	
	public Class<T> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	

	@SuppressWarnings("unchecked")
	public T find(ID id) {
		if (id != null) {
			return (T) getSessionFactory().getCurrentSession().get(entityClass, id);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public T save(T entity) {
		return  (T) getSessionFactory().getCurrentSession().save(entity);
	}

}
