package com.telusko.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.telusko.web.dao.AlienDao;

@WebServlet("/add")
public class AddAlien extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		int aid = (int) session.getAttribute("aid");

		String aname = req.getParameter("aname");
		String tech = req.getParameter("tech");
		PrintWriter out = resp.getWriter();
		out.println(aid+" "+aname + " " + tech);
		out.println();
		AlienDao dao = new AlienDao();
		if (dao.setValues(aid,aname,tech))
			out.println("the value have been set into the database");
		else 
			out.println("No insertion ! some error has been occured");
		

	}
}
