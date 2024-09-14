package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			int firstNum = Integer.parseInt(req.getParameter("firstNum"));
			int secondNum = Integer.parseInt(req.getParameter("secondNum"));
			
			int sum = firstNum+secondNum;
			PrintWriter out = res.getWriter();
			out.print("Sum is: "+sum);
			
		}
}
