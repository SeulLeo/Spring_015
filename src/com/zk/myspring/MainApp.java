package com.zk.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[]args)
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		TextEditor te=(TextEditor) ac.getBean("textEditor");
		te.spellCheck();
	}
}
