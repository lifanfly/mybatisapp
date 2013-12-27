package com.tyt.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.springframework.stereotype.Repository;

import com.tyt.entity.Student;

import java.util.List;
import java.util.Map;

@Repository(value = "studentDao")
public interface StudentDao extends SqlMapper{

	/**
	 * 调用存储过程
	 * @return
	 */
	@Select("call getStudent()")
    public List<Student> getStudentByProcedure();
	
	/**
	 * 普通查询
	 * @return
	 */
	@Select("SELECT * FROM STUDENT")
    public List<Student> getAllStudent();
	
	/**
	 * 自定义查询字段，返回map
	 * @return
	 */
	//@Select(" select name aa,loginname bb from userinfo where id=2")
	@Select(" SELECT id sid,name sname from STUDENT")
	@Results(value = { 
			@Result(property = "sid", column = "sid"), 
			@Result(property = "sname", column = "sname") 
	}) 
    public List<Map<String,String>> getStudentByMap();
	
	/**
	 * 自定义查询字段，别名，返回List
	 * @return
	 */
	@Select(" SELECT id sid,name sname from STUDENT")
	@Results(value = { 
			@Result(property = "id", column = "sid"), 
			@Result(property = "name", column = "sname") 
	}) 
    public List<Student> getStudentList();

	/**
	 * 带参数查询
	 * @param id
	 * @return
	 */
	@Select("SELECT * FROM STUDENT WHERE id = #{id}")
    public Student getStudentInfo(@Param(value="id")int id);

	/**
	 * 带参数查询
	 * @param name
	 * @return
	 */
    @Select("SELECT * FROM STUDENT WHERE name = #{name}")
    public List<Student> getStudentByName(@Param(value="name")String name);

    /**
	 * 插入
	 * @param user
	 * @return
	 */
    @Insert("INSERT INTO STUDENT(tid,name, address, phone,age)"
    		+ " VALUES(#{std.tid}, #{std.name}, #{std.address}, #{std.phone}, #{std.age})")
    public void addStudent(@Param(value="std")Student std);

    /**
	 * 修改
	 * @param user
	 * @return
	 */
    @Update("UPDATE STUDENT SET name = #{std.name} WHERE id = #{std.id}")
    public void editStudent(@Param(value="std")Student std);

    /**
	 * 删除
	 * @param id
	 * @return
	 */
    @Delete("DELETE FROM STUDENT WHERE id = #{id}")
    public void removeStudent(@Param(value="id")int id);
    
    /**
     * 自定义关联查询
     * @return
     */
    public List<Student> getStudentAndTeacher();
    
    /**
     * 动态SQL查询 ,判断条件组成
     * @param std
     * @return
     */
    public List<Student> getStudentByQuery(@Param(value="std")Student std);
    
    /**
     * 动态SQL查询 ,根据list组织SQL，in
     * @return
     */
    public List<Student> getStudentByIdIn(@Param(value="list")List<Integer> list);
	
}
