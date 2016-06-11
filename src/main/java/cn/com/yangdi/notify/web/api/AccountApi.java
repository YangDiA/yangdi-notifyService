package cn.com.yangdi.notify.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.com.yangdi.notify.biz.Account.AudienceBiz;
import cn.com.yangdi.notify.model.Account.Audience;

@RestController
@CrossOrigin // (origins = "http://localhost:8880", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
@RequestMapping("/v1.0")
public class AccountApi {
	
	@Autowired
	private AudienceBiz audienceBiz;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public String test(){
		System.err.println("**********");
		Audience audience = new Audience();
		audience.setUserCode("111");
		audience.setPassWord("2");
		audience.setAppKey("kkk");
		audienceBiz.saveAudience(audience);
		return "aa";
	}
}
