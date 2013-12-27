package com.tyt.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.tyt.dao.StudentDao;
import com.tyt.entity.Student;
import com.tyt.service.IStudentService;

@Service(value = "studentService")
public class StudentServiceImpl implements IStudentService {

	@Resource(name="studentDao")
	private StudentDao dao;
	
	public List<Student> getStudentByProcedure() {
		return dao.getStudentByProcedure();
	}

	public List<Student> getAllStudent() {
		return dao.getAllStudent();
	}

	public List<Map<String, String>> getStudents() {
		return dao.getStudentByMap();
	}

	public List<Student> getStudentList() {
		return dao.getStudentList();
	}

	public Student getStudentInfo(int id) {
		return dao.getStudentInfo(id);
	}

	public List<Student> getStudentByName(String name) {
		return dao.getStudentByName(name);
	}

	public void addStudent(Student std) {
		dao.addStudent(std);
	}

	public void editStudent(Student std) {
		dao.editStudent(std);
	}

	public void removeStudent(int id) {
		dao.removeStudent(id);
	}

	public List<Student> getStudentAndTeacher() {
		return dao.getStudentAndTeacher();
	}

	public List<Student> getStudentByQuery(Student std) {
		return dao.getStudentByQuery(std);
	}

	public List<Student> getStudentByIdIn(List<Integer> list){
		return dao.getStudentByIdIn(list);
	}
}
