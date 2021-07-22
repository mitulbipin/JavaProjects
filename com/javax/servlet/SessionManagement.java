package com.javax.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.basics.commonMethods;

@SuppressWarnings("serial")
public class SessionManagement extends HttpServlet {
	HttpServletRequest request; HttpServletResponse response;
	commonMethods cs = new commonMethods();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		HttpSession session = request.getSession(true);
		Date createTime = new Date(session.getCreationTime());
		Date lastAccessTime = new Date(session.getLastAccessedTime());
		
		String title = "Welcome to this page";
		int visitCount = 0;
		String visitCountKey = "VisitCount", userIDKey = "userID", userID = "1234ASBDD";
		
		if(session.isNew()){
			title = "Wecome back";
			session.setAttribute(visitCountKey, visitCount);
		}else{
			visitCount = (Integer)session.getAttribute(visitCountKey);
			visitCount++;
			userID = (String)session.getAttribute(userIDKey);
		}
		session.setAttribute(visitCountKey, visitCount);
		
		response.setContentType("text/html");
		PrintWriter output = response.getWriter();
		
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
		
	      output.println(docType +
	    	         "<html>\n" +
	    	            "<head><title>" + title + "</title></head>\n" +
	    	            
	    	            "<body bgcolor = \"#f0f0f0\">\n" +
	    	               "<h1 align = \"center\">" + title + "</h1>\n" +
	    	               "<h2 align = \"center\">Session Infomation</h2>\n" +
	    	               "<h3 align = \"center\">" + lastAccessTime + "</h1>\n" +
	    	               "<h4 align = \"center\">"+ session.getId() +"</h2>\n" +
	    	               "<h5 align = \"center\">"+createTime +"</h2>\n" +
	    	            "</body></html>"
	         );
	}
}