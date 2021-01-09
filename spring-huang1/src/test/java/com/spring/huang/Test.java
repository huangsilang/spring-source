package com.spring.huang;

import com.spring.huang.service.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext();
		GenericBeanDefinition genericBeanDefinition1 = new GenericBeanDefinition();
		genericBeanDefinition1.setBeanClass(User.class);
		MutablePropertyValues propertyValues1 = new MutablePropertyValues();
		propertyValues1.add("name","张三");
		propertyValues1.add("sex","男");
		genericBeanDefinition1.setPropertyValues(propertyValues1);
		ac.registerBeanDefinition("user",genericBeanDefinition1);
		//ac.refresh();
		/*GenericBeanDefinition genericBeanDefinition2 = new GenericBeanDefinition();
		genericBeanDefinition2.setBeanClass(Order.class);
		MutablePropertyValues propertyValues2 = new MutablePropertyValues();
		propertyValues2.add("name","李四");
		genericBeanDefinition2.setPropertyValues(propertyValues2);
		genericBeanDefinition2.setParentName("user");
		ac.registerBeanDefinition("order",genericBeanDefinition2);*/
		ac.refresh();
		User user = ac.getBean(User.class);
		System.out.println(user);
	}

}
