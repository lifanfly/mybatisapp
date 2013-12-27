package com.tyt.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import com.tyt.entity.Student;
import com.tyt.service.impl.StudentServiceImpl;

public class StudentServiceTest {

	ApplicationContext ctx = null;
	StudentServiceImpl service = null;
	
	
    @Before
    public void setUp() throws Exception {
        ctx = InitApplicationContext.getApplicationContext();
        service = (StudentServiceImpl)ctx.getBean("studentService");
    }
    
    @Test
    public void testAddStudent(){
    	Student std = new Student();
    	std.setName("lixinjun");
    	std.setAge(20);
    	std.setAddress("address");
    	std.setTid(1);
    	std.setPhone("phone");
    	service.addStudent(std);
    }
	
}
