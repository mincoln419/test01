package com.hb.controller;

import javax.servlet.http.HttpServletRequest;

import com.hb.core.Controller;

public class AddController implements Controller {

	//url- add.do
	@Override
	public String execute(HttpServletRequest req){
		
		System.out.println("AddController run...");
		return "add";
	}
}
