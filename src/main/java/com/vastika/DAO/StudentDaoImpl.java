package com.vastika.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vastika.Model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	private static final Logger logger = LoggerFactory.getLogger(StudentDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionfactory;
	
//	public void setSessionfactory(SessionFactory sessionfactory) {
//		this.sessionfactory = sessionfactory;
//	}

	@Override
	public void addStudent(Student s) {
		Session session = this.sessionfactory.getCurrentSession();
		session.persist(s);
		logger.info("Person saved successfully, Person Details="+s);
		System.out.println("Person saved successfully, Person Details="+s);
	}

	@Override
	public void deleteStudent(int id) {
		Session session = this.sessionfactory.getCurrentSession();
		Student p = (Student) session.load(Student.class, new Integer(id));
		session.delete(p);

	}

	@Override
	public void editStudent(Student s) {
		Session session = this.sessionfactory.getCurrentSession();
		session.update(s);

	}

	@Override
	public Student getStudentID(int id) {
		Session session = this.sessionfactory.getCurrentSession();
		Student p = (Student) session.load(Student.class, new Integer(id));
		return  p;
	}

	@Override
	public List<Student> getStudents() {
		Session session = this.sessionfactory.getCurrentSession();
		List<Student> studentList = session.createQuery("from Student").list();
		return (List<Student>) studentList;
		
	}

}
