//this is controller of mvc
package com.telusko.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.telusko.web.dao.AlienDao;
import com.telusko.web.model.Alien;

/**
 * Servlet implementation class GetAlienController
 */

public class GetAlienController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int aid = Integer.parseInt(req.getParameter("aid"));
		AlienDao dao = new AlienDao();
		Alien a1 = dao.getAlien(aid);
		
		req.setAttribute("alien",a1);
		
		RequestDispatcher rd = req.getRequestDispatcher("showAlien.jsp");
		rd.forward(req, resp);
		
	}

}
