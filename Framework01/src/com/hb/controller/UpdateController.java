package com.hb.controller;

import javax.servlet.http.HttpServletRequest;

import com.hb.core.Controller;
import com.hb.model.entity.GuestDao;

public class UpdateController implements Controller {

	@Override
	public String execute(HttpServletRequest req) {
		// TODO Auto-generated method stub
		String param1=req.getParameter("sabun");
		String param2=req.getParameter("name");
		String param3=req.getParameter("nalja");
		int sabun=Integer.parseInt(param1);
		String name=param2;
		String nalja=param3;
		GuestDao dao=new GuestDao();
		dao.updatedOne(sabun, name, nalja);
		
			return "redirect:detail.do?idx="+sabun;
		
	}
}
