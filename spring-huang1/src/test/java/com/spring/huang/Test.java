package com.spring.huang;

import com.spring.huang.config.Config;
import com.spring.huang.service.HuangServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext(Config.class);
		ac.getBean(Config.class);
		HuangServiceImpl bean = ac.getBean(HuangServiceImpl.class);
		bean.get();
	}

}
