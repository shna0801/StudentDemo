package com.vastika.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vastika.Model.Student;
import com.vastika.DAO.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
//	public void setStudentDao(StudentDao StudentDoa){
//		this.studentDao = StudentDoa;
//		
//	}
	@Override
	@Transactional
	public void addStudent(Student s) {
		this.studentDao.addStudent(s);
	}


	@Override
	public void editStudent(Student s) {
		this.studentDao.editStudent(s);
	}

	@Override
	public Student getStudentID(int id) {
		
		return (Student) this.studentDao.getStudentID(id);
	}

	@Override
	public List<Student> getStudents() {
		
		return  this.studentDao.getStudents();
	}
	@Override
	public void deleteStudent(int id) {
		this.studentDao.deleteStudent(id);
		
	}

}
