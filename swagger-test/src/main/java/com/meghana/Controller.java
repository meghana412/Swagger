package com.meghana;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Controller {
	@RequestMapping(method = RequestMethod.GET, value = "/api/meghana")
	public Student sayHello() {
		Student stu = new Student();
		stu.setName("meghana");
		stu.setId(123);
		return stu;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public String name(){
		return"student name";
		
	}

}
