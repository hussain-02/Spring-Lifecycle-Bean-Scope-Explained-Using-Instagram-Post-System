package com.example.SocialMedia;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class SocialMediaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SocialMediaApplication.class, args);
		ClassPathXmlApplicationContext  applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter userName : ");
		sc.nextLine();
		String userName = sc.nextLine();


		User user = (User)applicationContext.getBean("user");

		user.SetUserName(userName);

		PostList postList = (PostList)applicationContext.getBean("postList");
		while(true) {
			System.out.println("choose from below \n 1.Create a post \n 2.Sell all post\n 3.Exit");
			int userSelect = sc.nextInt();
			switch (userSelect) {
				case 1: {
					Post post = (Post) applicationContext.getBean("post");
					sc.nextLine();
					String message = sc.nextLine();
					post.setMessage(message);
					postList.setPost(post);
					user.setPostList(postList);
					break;
				}
				case 2: {
					postList.getAllPost().forEach(items -> System.out.println(items.getMessage()));
					break;
				}
				case 3: {
					applicationContext.close();
				}
			}
		}
	}

}
