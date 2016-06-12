package cn.com.yangdi.notify.dao.impl.Account;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cn.com.yangdi.notify.base.BaseDaoImpl;
import cn.com.yangdi.notify.dao.Account.AudienceDao;
import cn.com.yangdi.notify.model.Account.Audience;

@Repository("audienceDaob")
public class AudienceDaobImpl implements AudienceDao{
	
	@Autowired
	@Qualifier("sessionFactoryb")
	private SessionFactory sessionFactory;

	
	public Audience find(String id) {
		if (id != null) {
			return (Audience) sessionFactory.getCurrentSession().get( Audience.class, id);
		}
		return null;
	}

	public Audience save(Audience entity) {
		sessionFactory.getCurrentSession().save(entity);
		return entity; 
	}

}
