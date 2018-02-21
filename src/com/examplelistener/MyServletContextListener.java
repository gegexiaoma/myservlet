package com.examplelistener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.example.Dog;

public class MyServletContextListener implements ServletContextListener {
	
	public void contextInitialized(ServletContextEvent event){
		
		ServletContext sc = event.getServletContext();
		String dog = sc.getInitParameter("beg");
		Dog d = new Dog(dog);
		sc.setAttribute("dog", d);
		
	}
	
	public void contextDestroyed(ServletContextEvent event){
		// to do nothing
	}
}
