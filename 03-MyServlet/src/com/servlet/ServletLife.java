package com.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLife extends HttpServlet {
	private void inin() {
		System.out.println("begin");

	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		arg1.getWriter().write("servlet life");
		System.out.println("servlet life");
	}
	private void destory() {
		System.out.println("我被销毁了");
	}
}
