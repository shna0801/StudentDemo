package com.vastika.DAO;

import java.util.List;

import com.vastika.Model.Student;

public interface StudentDao {
	
	public void addStudent(Student s);
	public void deleteStudent(int id);
	public void editStudent(Student s);
	public Student getStudentID(int id);
	public List<Student>  getStudents();

}
