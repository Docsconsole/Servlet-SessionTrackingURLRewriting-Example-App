package com.docsconsole.tutorials;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;

public class HomeServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String userName = request.getParameter("userName");

			// userName will be appended here
			out.print("<div style='padding-left: 50px; padding-top: 50px;'>");
			out.print("<span style='color: #00bcd4;'>Welcome:</span>" + userName);
			out.print("<a href='SendURLRewritingValue?userName=" + userName + "' style='padding-left: 10px; font-size: 20px;'>Send URLRewriting Value</a>");
			out.print("</div>");
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}