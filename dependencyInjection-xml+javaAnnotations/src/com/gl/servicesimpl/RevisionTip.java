package com.gl.servicesimpl;

import org.springframework.stereotype.Component;

import com.gl.services.ExamTip;

@Component
public class RevisionTip implements ExamTip {

	@Override
	public String getTip() {
		return "dependency injection";
	}

}
