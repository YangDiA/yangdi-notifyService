package cn.com.yangdi.notify.web.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin // (origins = "http://localhost:8880", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
@RequestMapping("/v1.0")
public class AccountApi {
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public String test(){
		System.err.println("**********");
		return "aa";
	}
}