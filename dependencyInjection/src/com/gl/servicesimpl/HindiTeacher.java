package com.gl.servicesimpl;

import com.gl.services.ExamTip;
import com.gl.services.Teacher;

public class HindiTeacher implements Teacher {

	private ExamTip tip;

	public HindiTeacher() {

	}

	public HindiTeacher(ExamTip tip) {
		this.tip = tip;
	}

	@Override
	public String homework() {
		System.out.println(tip.getTip());
		return "Test";
	}

}
