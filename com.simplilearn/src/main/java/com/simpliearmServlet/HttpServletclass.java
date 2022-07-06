package com.simpliearmServlet;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Date;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletclass
 */
@WebServlet("/HttpServletclass")
public class HttpServletclass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpServletclass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// We can read the data from request for index.html using ?Nitesh .Passing data from client server in URL pattern.
		String name = request.getParameter ("name");
		//Bussiness logic
		PrintWriter out = response.getWriter();
		out.append("<html> <body>");
		out.append("<h1> Welcome to the world </h1>");
		out.append("<p>Hello " + name  + "</p>");
		out.append("<br/>");
		out.append ("Current date : " +new Date());
		
		out.append("</body> </html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println ("<html>");
		out.println ("<h3> This is a post method </h3>");
		out.println ("Hello "+  request.getParameter("name"));
		out.println ("</htlm>");
		
		
	}

}
