package com.sjw.midterm3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PostMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"midterm3.xml");
		PostService postService = context.getBean("postService",
				PostService.class);

		postService.post();
		postService.list();
		postService.like();
		context.close();
	}

}