package com.main;

import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import com.sp.rmi.QueueService;

public class RmiTest {

	
	public static void main(String[] args) {
//		RmiProxyFactoryBean
		RmiProxyFactoryBean rm = new RmiProxyFactoryBean();
		rm.setServiceInterface(QueueService.class);
		rm.setServiceUrl("rmi://127.0.0.1:8111/queueService");
	    rm.afterPropertiesSet();
		QueueService qq=(QueueService) rm.getObject();
		System.out.println(qq);
		for(int i=0;i<10000;i++){
			qq.add("aaaaaaaaaaaaa");
		}
	}
}
