package com.gl.servicesimpl;

import org.springframework.stereotype.Component;

import com.gl.services.ExamTip;

@Component
public class PreviousPapersTip implements ExamTip {

	@Override
	public String getTip() {
		return "DI with @qualifier";
	}

}
