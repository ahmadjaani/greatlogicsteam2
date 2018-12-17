package com.logic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.logic.dao.UserDAO;
import com.logic.model.User;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter w = response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		String name = request.getParameter("nm");
		String email = request.getParameter("eml");
		String password = request.getParameter("pwd");
		int id = Integer.parseInt(request.getParameter("id"));

		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);

		int i = UserDAO.save(user);
		if (i > 0) {
			w.println("<h1>User Details</h1>");
			w.println("<h2> Welcome " + name + "! </h2>");
			w.println("<h2> You have been successfully registered. </h2>");
		} else {
			w.println("<h2>We could not process your data</h2>");
			w.println("<h3><a href=signup.html>Try Again</a></h3>");
		}
		w.close();
	}
}