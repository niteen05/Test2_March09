package com.example.test2.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test2.model.MyApplication;

@RestController
public class RestControllerExample {
	
	@RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
	@ResponseBody
	public MyApplication healthCheck() {
		
		MyApplication status = new MyApplication();
		status.setDescription("pre-interview technical test");
		status.setVersion("1.0");
		status.setLastCommitSha("xxyyzz123456");
			
		return status;
		
		
	}
	
	public void methodWithoutJunits() {
		
		MyApplication status = new MyApplication();
		status.setDescription("desc");
		status.setVersion("1.1111");
		status.setLastCommitSha("abcdddd");
		
	}

}
