package com.hb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.hb.core.Controller;
import com.hb.model.entity.GuestDao;
import com.hb.model.entity.GuestDto;

public class ListController implements Controller {

	//url - list.do
	
	public ListController() {
		// TODO Auto-generated constructor stub
		
	}
	
	public String execute(HttpServletRequest req){
		System.out.println("ListController run..");
		
		GuestDao dao=new GuestDao();
		List<GuestDto> list=dao.selectAll();
		for(GuestDto bean : list){
			System.out.println(bean);
		}
		req.setAttribute("alist", list);
		
		return "list";
	}

	
	
}
