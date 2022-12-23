package com.gl.servicesimpl;

import org.springframework.stereotype.Component;

import com.gl.services.Teacher;

@Component("customName")
public class HindiTeacher implements Teacher {

	@Override
	public String homework() {
		return "Test";
	}

}
