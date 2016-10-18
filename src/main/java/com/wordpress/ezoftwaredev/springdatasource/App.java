package com.wordpress.ezoftwaredev.springdatasource;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		DataSource source = (DataSource) ctx.getBean("dataSource");
	}
	
}
