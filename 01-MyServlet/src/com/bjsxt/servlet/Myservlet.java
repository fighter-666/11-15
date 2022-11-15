package com.bjsxt.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().write("this my first servlet");
		System.out.println("this my first servlet");
	}
}
