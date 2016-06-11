package cn.com.yangdi.notify.schd;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CleanCacheScheduler {
	
	@Scheduled(cron = "0 0/1 * * * ?")
	private void testClean(){
		
		System.out.println("11111");
	}
	
	/**  
     * 心跳更新。启动时执行一次，之后每隔2秒执行一次  
     */    
    @Scheduled(fixedRate = 1000*2)   
    public void print(){  
        System.out.println("Annotation：print run");  
    }  

}
