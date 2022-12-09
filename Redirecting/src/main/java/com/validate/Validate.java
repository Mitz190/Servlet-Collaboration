package com.validate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Validate")
public class Validate extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter wr =resp.getWriter();
		String name=req.getParameter("uname");
		String pass=req.getParameter("pass");
		if (name.equals("XYZ") && pass.equals("XYZ") ) {
			RequestDispatcher rd =req.getRequestDispatcher("Welcome");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd =req.getRequestDispatcher("index.html");
			wr.print("username and pass not correct !!");
			rd.include(req, resp);
		}
	}

}
