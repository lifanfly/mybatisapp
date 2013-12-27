package com.tyt.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tyt.entity.Student;
import com.tyt.service.IStudentService;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA. User: Administrator Date: 13-5-28 Time: ����4:12
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class StudentController {

	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Resource(name = "studentService")
	IStudentService service;

	@RequestMapping(value = "/addStudent.action")
	public String addStudent(HttpServletRequest request) {
		Student std = new Student();
		std.setAge(10);
		std.setName("lifanfly");
		std.setTid(1);
		std.setPhone("13810959578");
		std.setAge(1);
		service.addStudent(std);
		logger.info("{}========={}",std.getName(),std.getPhone());
		return "/result";
	}

	@RequestMapping(value = "/queryStudentAndTeacher.action")
	public String queryStudentAndTeacher(HttpServletRequest request) {

		List<Student> list = service.getStudentAndTeacher();
		for (Student s : list) {
			logger.info("{}========={}",s.getTeacher().getName(),s.getTeacher().getEmail());
		}
		return "/result";
	}

	@RequestMapping(value = "/queryStudent.action")
	public String queryStudent(HttpServletRequest request) {
		Student std = new Student();
		std.setAge(10);
		std.setName("lifanfly");
		std.setTid(1);
		std.setPhone("13810959578");
		std.setAge(1);
		service.addStudent(std);
		logger.info("========================no param query=======================");
		List<Student> list = service.getStudentByQuery(new Student());

		for (Student s : list) {
			logger.info("{}========={}",s.getName(),s.getPhone());
		}

		logger.info("========================one param query========================");
		List<Student> list1 = service.getStudentByQuery(std);

		for (Student s : list1) {
			logger.info("{}========={}",s.getName(),s.getPhone());
		}
		return "/result";
	}

	@RequestMapping(value = "/updateStudent.action")
	public String updateStudent(HttpServletRequest request) {
		Student std = new Student();
		std.setId(1);
		std.setName("lifanfly_test");
		service.editStudent(std);
		logger.info("========================SELECT * ========================");
		List<Student> list = service.getAllStudent();
		for (Student s : list) {
			logger.info("{}========={}", s.getName(), s.getPhone());
		}

		logger.info("=======================call Procedure=========================");
		List<Student> list1 = service.getStudentByProcedure();
		for (Student s : list1) {
			logger.info("{}========={}", s.getName(), s.getPhone());
		}

		logger.info("==================return Maps==============================");
		List<Map<String, String>> list2 = service.getStudents();
		// for(Map.Entry<String, String> tr:list2.entrySet()){
		// System.out.println(tr.getKey() + "==========" + tr.getValue());
		// }
		for (Map<String, String> map : list2) {
			logger.info("{}============={}",
					new Object[] { map.get("sid"), map.get("sname") });
		}
		return "/result";
	}
	@RequestMapping(value = "/getStudentByIdIn.action")
	public String getStudentByIdIn(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		List<Student> stList = service.getStudentByIdIn(list);
		for (Student s : stList) {
			logger.info("{}========={}======={}", s.getName(), s.getPhone(),s.getId());
		}
		return "/result";
	}
}
