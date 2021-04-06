package com.wolken.wolkenapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter

@Component
public class MemesBean {
	private String pageName;
	private String memeGenre;
	private int noOfFol;
	@Autowired
	public MemesBean(@Value("ghanta") String pageName, @Value("generic") String memeGenre,@Value("40000000") int noOfFol) {
		super();
		this.pageName = pageName;
		this.memeGenre = memeGenre;
		this.noOfFol = noOfFol;
	}
	
	public void tag() {
		System.out.println("@kishan neene idhu");
	}

}
