package com.spring.huang.config;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: huangsilang
 * @Date: 2020/5/28 16:24
 */
@EnableAspectJAutoProxy
public class springConfig {

	@Pointcut("execution(public * com.cfets.elk.rest.ElkRuleResource.*(..)))")
	public void aspect(){

	}
}
