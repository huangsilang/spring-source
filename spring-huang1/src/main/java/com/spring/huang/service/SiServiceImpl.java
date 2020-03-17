package com.spring.huang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SiServiceImpl implements HuangService{

	@Autowired
	HuangServiceImpl huangServiceImpl;
	public void get(){
		System.out.println(huangServiceImpl);
	}
}
