package com.example.test2.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("myapplication")                                                                                         
@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT ,use = JsonTypeInfo.Id.NAME)
public class MyApplication {
	
	private String version;
	
	private String description;
	
	private String lastCommitSha;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLastCommitSha() {
		return lastCommitSha;
	}

	public void setLastCommitSha(String lastCommitSha) {
		this.lastCommitSha = lastCommitSha;
	}

}
