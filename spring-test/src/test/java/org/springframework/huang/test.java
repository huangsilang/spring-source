package org.springframework.huang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.Resources;


public class test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(Config.class);
		annotationConfigApplicationContext.register(User.class);
		annotationConfigApplicationContext.refresh();
		User user = (User)annotationConfigApplicationContext.getBean("user");
		System.out.println(user);
	}
}
