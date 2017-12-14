package com.hb.controller;

import java.sql.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.hb.core.Controller;
import com.hb.model.entity.GuestDao;

public class InsertController implements Controller {

	@Override
	public String execute(HttpServletRequest req) {
		// TODO Auto-generated method stub
		Map<String,String> param=new HashMap<String, String>();
		Enumeration<String> paramNames=req.getParameterNames();
		int cnt=0;
		while(paramNames.hasMoreElements()){
		String pname=paramNames.nextElement();
		param.put(pname, req.getParameter(pname));
		}
		int sabun=Integer.parseInt(param.get("sabun"));
		String name=param.get("name");
		String nalja=param.get("nalja");//20171214
		System.out.println(sabun+name+nalja);
		
		GuestDao dao=new GuestDao();
		dao.insertOne(sabun, name, nalja);
		
		return "redirect:list.do";
	}
}
