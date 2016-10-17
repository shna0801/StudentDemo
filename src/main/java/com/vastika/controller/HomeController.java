package com.vastika.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vastika.Model.Student;
import com.vastika.Service.StudentServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private StudentServiceImpl studentserviceimpl;
	
//	
//	
//	public void setStudentserviceimpl(StudentServiceImpl studentserviceimpl) {
//		this.studentserviceimpl = studentserviceimpl;
//	}


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";

	}
	

	@RequestMapping(value = "/getStudents", method = RequestMethod.GET)
	public String getStudent(Model model) {
	    model.addAttribute("personlist", this.studentserviceimpl.getStudents());
		//List<Student> list = (List<Student>) this.studentserviceimpl.getStudents();
		//return new ModelAndView("personlist","personlist",list);
	    return "personList";
		
	}
	

	@RequestMapping(value = "/getStudentID/{id}", method = RequestMethod.GET)
	public String getStudentID(@PathVariable("id") int id, Model model) {
		model.addAttribute("person",this.studentserviceimpl.getStudentID(id));
		return "StudentID";

	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student student) {
		//model.addAttribute("person",studentserviceimpl.getStudentID(id));
		 this.studentserviceimpl.addStudent(student);
		return "sucess";

	}
	
}
