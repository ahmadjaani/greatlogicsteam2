package com.logic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.logic.dao.DbUtil;
import com.logic.dao.UserDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter w = response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		String email = request.getParameter("eml");
		String pass = request.getParameter("pwd");
//		System.out.println("going to dao layer");
		boolean result = UserDAO.validate(email, pass);
		if(result) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
		}
			
//		System.out.println("after dao layer");
		if (result) {
			w.println("<h1>Welcome " + email + "</h1>");
			w.print("<h2>You are our esteemed user!!!</h2>");
	
		} else {
			w.println("<h3>Wrong Credentials:))</h3>");
			w.println("<a href=login.html>Try Again</a>");
		}
	}
}
