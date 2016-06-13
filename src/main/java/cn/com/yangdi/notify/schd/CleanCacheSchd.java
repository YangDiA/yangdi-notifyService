package cn.com.yangdi.notify.schd;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CleanCacheSchd {

	
	@Scheduled(cron="0/5 * * * * ?")
	public void test(){
		System.err.println("每5秒执行一次");
	}
	
}
