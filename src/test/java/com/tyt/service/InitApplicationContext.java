package com.tyt.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tyt.entity.Student;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 2010-5-29
 * Time: 9:39:37
 * To change this template use File | Settings | File Templates.
 */
public class InitApplicationContext {

	public static ApplicationContext getApplicationContext() {
		String path = "applicationContext.xml";
		return new FileSystemXmlApplicationContext(path);
	}
	
}
