package test.service.account;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.yangdi.notify.biz.Account.AudienceBiz;
import cn.com.yangdi.notify.model.Account.Audience;

@RunWith(SpringJUnit4ClassRunner.class)
//加载spring配置文件
@ContextConfiguration(locations = { "classpath:/applicationContext-dao.xml",
		"classpath:/applicationContext-service.xml" })
public class AudienceTest  {

	@Autowired
	private AudienceBiz biz;
	
	@Test
	public void test() {
		Audience audience = new Audience();
		audience.setUserCode("111");
		audience.setPassWord("2");
		audience.setAppKey("kkk");
		biz.saveAudience(audience);
		System.err.println("*");
	}

}
