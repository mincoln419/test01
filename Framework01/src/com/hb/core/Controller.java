package com.hb.core;

import javax.servlet.http.HttpServletRequest;

public interface Controller{

	 public default String execute(HttpServletRequest req){
		return "";
	};
}
