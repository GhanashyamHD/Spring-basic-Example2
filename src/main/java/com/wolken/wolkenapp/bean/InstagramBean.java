package com.wolken.wolkenapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
//@Setter

@Component
public class InstagramBean {
	@Value("mhr_xoxo")
	private String instaId;
	@Value("125")
	private int noOfposts;
	@Autowired
	private MemesBean memes;
	
	public void scroll() {
		System.out.println("like..share....save");
	}
	

}
