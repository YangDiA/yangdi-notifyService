package cn.com.yangdi.notify.dao.impl.Account;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import cn.com.yangdi.notify.base.BaseDaoImpl;
import cn.com.yangdi.notify.dao.Account.AudienceDao;
import cn.com.yangdi.notify.model.Account.Audience;

@Repository("audienceDao")
public class AudienceDaoImpl extends BaseDaoImpl<Audience, String> implements AudienceDao {

	@Autowired
	@Qualifier("NotifyDB.SF")
	private SessionFactory sessionFactory;
	
	@Override
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}



	

	
	
	
}
