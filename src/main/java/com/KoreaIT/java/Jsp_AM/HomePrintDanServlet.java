package com.KoreaIT.java.Jsp_AM;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/home/printDan")//사용자의 요청을 받아들이는것까지만.
public class HomePrintDanServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.getRequestDispatcher("/jsp/home/printDan.jsp").forward(request, response);
		//요청을 한번 더 한다. 이놈한테 -->"jsp/home/printDan.jsp"
		//.forward쪽으로 toss하고 응답을 다시 "jsp/home/printDan.jsp" 넘겨준다.
//		response.getWriter().append("Hi~");
	
	}
}
