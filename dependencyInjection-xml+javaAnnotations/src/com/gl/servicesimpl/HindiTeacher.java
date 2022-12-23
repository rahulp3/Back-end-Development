package com.gl.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.gl.services.ExamTip;
import com.gl.services.Teacher;

@Component
public class HindiTeacher implements Teacher {

	private ExamTip tip;

	public HindiTeacher() {

	}

	@Autowired
	public HindiTeacher(@Qualifier("previousPapersTip")ExamTip tip) {
		this.tip = tip;
	}

	@Override
	public String homework() {
		System.out.println(tip.getTip());
		return "Test";
	}

}
