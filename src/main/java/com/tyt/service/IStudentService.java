package com.tyt.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.tyt.entity.Student;

public interface IStudentService {

	/**
	 * 调用存储过程
	 * @return
	 */
	public List<Student> getStudentByProcedure();
	
	/**
	 * 普通查询
	 * @return
	 */
    public List<Student> getAllStudent();
	
	/**
	 * 自定义查询字段，返回map
	 * @return
	 */
    public List<Map<String,String>> getStudents();
	
	/**
	 * 自定义查询字段，别名，返回List
	 * @return
	 */
    public List<Student> getStudentList();

	/**
	 * 带参数查询
	 * @param id
	 * @return
	 */
    public Student getStudentInfo(int id);

	/**
	 * 带参数查询
	 * @param name
	 * @return
	 */
    public List<Student> getStudentByName(String name);

    /**
	 * 插入
	 * @param user
	 * @return
	 */
    public void addStudent(Student std);

    /**
	 * 修改
	 * @param user
	 * @return
	 */
    public void editStudent(Student std);

    /**
	 * 删除
	 * @param id
	 * @return
	 */
    public void removeStudent(int id);
    
    /**
     * 自定义关联查询
     * @return
     */
    public List<Student> getStudentAndTeacher();
    
    /**
     * 动态SQL
     * @param std
     * @return
     */
    public List<Student> getStudentByQuery(Student std);
    
    /**
     * 动态SQL查询 ,根据list组织SQL，in
     * @return
     */
    List<Student> getStudentByIdIn(List<Integer> list);
	
}
