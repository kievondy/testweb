package com.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.support.WebApplicationContextUtils;

import com.test.service.TestService;

public class TestServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		TestService bean = WebApplicationContextUtils.getWebApplicationContext(req.getSession().getServletContext()).getBean(TestService.class);
		String string = bean.getString();
		resp.getWriter().write("<h1>" + string + "</h1>");
	}

}
