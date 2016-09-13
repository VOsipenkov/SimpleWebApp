package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pageTwoProcess
 */
public class pageTwoProcess extends HttpServlet {
	private static final long serialVersionUID = 2L;
       
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("OK");
		String id = request.getParameter("id");
		String course = request.getParameter("course");
		
		System.out.println("id: "+id);
		System.out.println("course"+ course);
		
		request.getSession().setAttribute("id", id);
		request.getSession().setAttribute("course", course);
		
		response.sendRedirect("jsp/printOut.jsp");
	}

}
