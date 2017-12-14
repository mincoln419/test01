package com.hb.core;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.controller.AddController;
import com.hb.controller.DetailController;
import com.hb.controller.InsertController;
import com.hb.controller.ListController;
import com.hb.controller.UpdateController;

public class FrontController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		super.doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String uri=req.getRequestURI();
		String cpath=req.getContextPath();
		String url=uri.substring(cpath.length());
		System.out.println(uri);
		System.out.println(cpath);
		System.out.println(url);
		Controller controll=null;
		if(url.equals("/list.do")){
			 controll=new ListController();			 
		}else if(url.equals("/add.do")){
			controll=new AddController();			
		}else if(url.equals("/insert.do")){
			controll=new InsertController();
		}else if(url.equals("/detail.do")){
			controll=new DetailController();
		}else if(url.equals("/update.do")){
			controll=new UpdateController();
		}
		
		String viewName=controll.execute(req);
		
		if(viewName.startsWith("redirect:")){
			resp.sendRedirect(viewName.substring(9));
			//veiwName.repalce("redirect:","");
			return;
		}
		
		viewName+=".jsp";
		
		req.getRequestDispatcher(viewName).forward(req, resp);
		
	}
	
	
}

