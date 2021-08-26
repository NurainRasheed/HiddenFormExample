package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String name=request.getParameter("uname");
			out.print("<br>Welcome " + name);
			out.print("<form action='next'>");
			out.print("<input type='hidden' name='uname' value='"+name+"'>");
			out.print("<input type='submit' value='Go'>");
			out.print("</form>");
			out.close();
		
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
}}
