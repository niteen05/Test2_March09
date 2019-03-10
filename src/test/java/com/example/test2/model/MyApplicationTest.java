package com.example.test2.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class MyApplicationTest {

	
	@Test
	public void testMyApplication() {
		
		MyApplication myApp = new MyApplication();
		myApp.setDescription("test Desc");
		myApp.setVersion("1.0");
		myApp.setLastCommitSha("lastCommitsha");
		
		Assert.assertEquals("test Desc111", myApp.getDescription());
		Assert.assertEquals("1.0", myApp.getVersion());
		Assert.assertEquals("lastCommitsha", myApp.getLastCommitSha());
		
		
		
		
		
	}
	
}
