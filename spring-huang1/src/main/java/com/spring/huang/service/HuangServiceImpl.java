package com.spring.huang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HuangServiceImpl implements HuangService{

	@Autowired
	SiServiceImpl siServiceImpl;

	public void get(){
		System.out.println(siServiceImpl);
		siServiceImpl.get();
	}

}
