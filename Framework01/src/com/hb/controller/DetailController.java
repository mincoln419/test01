package com.hb.controller;

import javax.servlet.http.HttpServletRequest;

import com.hb.core.Controller;
import com.hb.model.entity.GuestDao;
import com.hb.model.entity.GuestDto;

public class DetailController implements Controller{
	
	@Override
	public String execute(HttpServletRequest req) {
		// TODO Auto-generated method stub
		String idx=req.getParameter("idx");
		int sabun=Integer.parseInt(idx);
		GuestDao dao=new GuestDao();
		GuestDto bean=dao.selectOne(sabun);
		req.setAttribute("bean", bean);	
		
		return "detail";
	}
}
