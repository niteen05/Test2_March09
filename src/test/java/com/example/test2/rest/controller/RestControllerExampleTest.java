package com.example.test2.rest.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.test2.model.MyApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestControllerExampleTest {

	@Test
	public void testhealthCheckUrl() {
		RestControllerExample rest = new RestControllerExample();
		MyApplication myApp = rest.healthCheck();

		Assert.assertEquals("pre-interview technical test111", myApp.getDescription());
		Assert.assertEquals("1.0", myApp.getVersion());
		Assert.assertEquals("xxyyzz123456", myApp.getLastCommitSha());

	}

}
