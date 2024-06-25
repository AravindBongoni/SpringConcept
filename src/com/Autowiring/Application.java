package com.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("autowiring.xml");
		B b = (B) con.getBean("b");
		b.display();
	}

}
