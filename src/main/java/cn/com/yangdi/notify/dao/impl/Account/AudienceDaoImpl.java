package cn.com.yangdi.notify.dao.impl.Account;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cn.com.yangdi.notify.dao.Account.AudienceDao;
import cn.com.yangdi.notify.model.Account.Audience;

@Repository("audienceDao")
public class AudienceDaoImpl implements AudienceDao {

	@Autowired
	@Qualifier("NotifyDB.SF")
	private SessionFactory sessionFactory;

	public Audience saveAudience(Audience audience) {
		 sessionFactory.getCurrentSession().save(audience);
		return audience;
	}

	public Audience getAudienceById(String id) {
		return  (Audience) sessionFactory.getCurrentSession().get(Audience.class, id);
	}
	
	
}
