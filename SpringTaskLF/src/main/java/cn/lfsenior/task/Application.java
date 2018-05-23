package cn.lfsenior.task;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ‘À––≥Ã–Ú
 * @author LFSenior
 *
 */
public class Application {
	public static void main(String[] args) {
		System.out.println("initializing....");
		new ClassPathXmlApplicationContext("classpath:spring/spring-config.xml").start();
		System.out.println("initializing");
	}
}
