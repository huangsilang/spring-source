package com.spring.huang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HuangServiceImpl implements HuangService{

	@Autowired
	SiServiceImpl siServiceImpl;
	@Autowired
	LangServiceImpl langServiceImpl;

	public HuangServiceImpl(){}

	public HuangServiceImpl(SiServiceImpl siServiceImpl){
		this.siServiceImpl = siServiceImpl;
	}
	public HuangServiceImpl(SiServiceImpl siServiceImpl,LangServiceImpl langServiceImpl){
		this.siServiceImpl = siServiceImpl;
		this.langServiceImpl = langServiceImpl;
	}

	public void get(){
		System.out.println(siServiceImpl);
		siServiceImpl.get();
	}

}
