package cn.com.yangdi.notify.dao.Account;

import cn.com.yangdi.notify.model.Account.Audience;

public interface AudienceDao {

	public Audience saveAudience(Audience audience);
	
	public Audience getAudienceById(String id);
}
