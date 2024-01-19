package com.KoreaIT.java.Jsp_AM;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/printDan")
public class printDanServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("EUC-KR");

		PrintWriter out = response.getWriter();

		String inputedDan = request.getParameter("dan");
		String inputedLimit = request.getParameter("limit");
		String color = request.getParameter("color");
		String color2 = request.getParameter("color");
		out.print("<html>");

		out.print("<h2><body bgcolor ="+color+"><h2>");
		out.print("<div style=\"color:red;\"><h2>"+123+"<h2></div>"+color2+"<br>");
		

//		out.print("<h1>my home</h1>");

		out.print("내 홈페이지에 온 것을 환영합니다.<br>");

		out.print("</body>");

		out.print("</html>");

		if(inputedDan == null) {
			inputedDan = "1";
		}
		if(inputedLimit == null) {
			inputedLimit = "1";
		}
		
		int dan = Integer.parseInt(inputedDan);
		int limit = Integer.parseInt(inputedLimit);
		
		response.getWriter().append(String.format("==%d단==<br>", dan));


		for (int i = 1; i <= 9; i++) {
			response.getWriter().append(String.format("%d * %d = %d<br>", dan, i, dan * i));
		}
	}
}
