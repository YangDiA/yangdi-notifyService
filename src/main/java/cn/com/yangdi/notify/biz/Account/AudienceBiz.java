package cn.com.yangdi.notify.biz.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.yangdi.notify.dao.Account.AudienceDao;
import cn.com.yangdi.notify.model.Account.Audience;

@Service("audienceBiz")
public class AudienceBiz {

	@Autowired
	private AudienceDao dao;
	

	@Transactional
	public Audience saveAudience(Audience audience){
		return dao.saveAudience(audience);
	}
	@Transactional(readOnly=true)
	public Audience getAudienceById(String id){
		return dao.getAudienceById(id);
	}
	
}
