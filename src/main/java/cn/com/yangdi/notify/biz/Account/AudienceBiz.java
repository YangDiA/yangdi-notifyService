package cn.com.yangdi.notify.biz.Account;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.com.yangdi.notify.base.BaseBiz;
import cn.com.yangdi.notify.base.BaseDao;
import cn.com.yangdi.notify.dao.Account.AudienceDao;
import cn.com.yangdi.notify.model.Account.Audience;

@Service("audienceBiz")
public class AudienceBiz extends BaseBiz<Audience, String>{

	@Resource
	private AudienceDao audienceDao;
	
	@Resource(name="audienceDaob")
	private AudienceDao audienceDaob;

	@Override
	public BaseDao<Audience, String> getBaseDao() {
		return audienceDao;
	}
	
	@Transactional("transactionManagerb")
	public Audience saveToDataBaseb(Audience audience){
		return audienceDaob.save(audience);
	}

	

	
	
}
