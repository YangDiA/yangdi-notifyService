package cn.com.yangdi.notify.aop;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class DataSourceAop {
	private final static Logger log=LoggerFactory.getLogger(DataSourceAop.class);
	
	/** 
     * 必须为final String类型的,注解里要使用的变量只能是静态常量类型的 
     */  
    public static final String EDP = "execution(* cn.com.yangdi.notify.biz.Account.AudienceBiz.sing*(..))";  
      
    @Before(EDP)    //spring中Before通知  
    public void logBefore() {  
    	log.error("--------------");
        System.out.println("logBefore:现在时间是:"+new Date());  
    }  
      
    @After(EDP)    //spring中After通知  
    public void logAfter() {  
        System.out.println("logAfter:现在时间是:"+new Date());  
    }  
      
    @Around(EDP)   //spring中Around通知  
    public Object logAround(ProceedingJoinPoint joinPoint) {  
        System.out.println("logAround开始:现在时间是:"+new Date()); //方法执行前的代理处理  
        Object[] args = joinPoint.getArgs();  
        Object obj = null;  
        try {  
            obj = joinPoint.proceed(args);  
        } catch (Throwable e) {  
            e.printStackTrace();  
        }  
        System.out.println("logAround结束:现在时间是:"+new Date());  //方法执行后的代理处理  
        return obj;  
    } 
}
