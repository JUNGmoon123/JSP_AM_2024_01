package com.KoreaIT.java.Jsp_AM.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

import com.KoreaIT.java.Jsp_AM.config.Config;
import com.KoreaIT.java.Jsp_AM.exception.SQLErrorException;
import com.KoreaIT.java.Jsp_AM.util.DBUtil;
import com.KoreaIT.java.Jsp_AM.util.SecSql;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/article/doDelete")
public class ArticleDeleteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		int loginedMemberId = -1;
		HttpSession session = request.getSession();
		loginedMemberId = (int)session.getAttribute("loginedMemberId");
		// DB연결
		try {
			Class.forName(Config.getDbDriverClassName());
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없습니다.");
			e.printStackTrace();
		}

		Connection conn = null;

		try {
			conn = DriverManager.getConnection(Config.getDbUrl(), Config.getDbUser(), Config.getDbPw());
			response.getWriter().append("연결 성공!");

			String str = request.getParameter("id");
			int id = Integer.parseInt(request.getParameter("memberId"));
//			loginedMember = (Map<String, Object>) session.getAttribute("loginedMember");

			System.out.println(loginedMemberId);
			System.out.println(str);
			SecSql sql = SecSql.from("DELETE");
			sql.append("FROM article");
			sql.append("WHERE memberId = ?;", id);

			System.out.println(loginedMemberId);
			if (loginedMemberId == id) {
				DBUtil.delete(conn, sql);
				response.getWriter().append(
						String.format("<script>alert('%d번 글이 삭제되었습니다.'); location.replace('list');</script>", id));
			} else {
				response.getWriter()
						.append(String.format("<script>alert('작성자가 아닙니다.'); location.replace('list');</script>"));
			}
			if (loginedMemberId == -1) {
				response.getWriter()
						.append(String.format("<script>alert('로그인하세요'); location.replace('../home/main');</script>"));
			}
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} catch (SQLErrorException e) {
			e.getOrigin().printStackTrace();
		} finally {
			try {
				if (conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}