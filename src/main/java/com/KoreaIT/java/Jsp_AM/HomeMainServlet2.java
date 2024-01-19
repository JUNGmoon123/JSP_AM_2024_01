package com.KoreaIT.java.Jsp_AM;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/printDan")
public class HomeMainServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append("Hello World!!!!!!!!!!!!!!!!!!!!!!!!!!: <br>").append(request.getContextPath()+"<br>");
		
		response.getWriter().append("==8단==<br>");
		
		for(int i = 2; i<10; i++) {
			response.getWriter().append("8"+" * "+ i+" = "+8*i+"<br>");
			response.getWriter().append("\n");
		}
	}
}
