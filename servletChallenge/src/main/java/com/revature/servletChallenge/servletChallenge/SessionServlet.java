package com.revature.servletChallenge.servletChallenge;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse restp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.setAttribute("username", "dev");
	}
}
