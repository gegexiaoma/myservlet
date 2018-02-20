package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ch1Servlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, 
					HttpServletResponse response)
					throws IOException{
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		SimpleDateFormat dateFormat = new SimpleDateFormat("���� yyyy��M��d�� -- ʱ�� HH:mm:ss");
		String today = dateFormat.format(new java.util.Date());
//		java.util.Date today = new java.util.Date();
		String cString1 = request.getParameter("param1");
		cString1 = new String(cString1.getBytes("ISO-8859-1"), "utf-8");
		String cString2 = request.getParameter("param2");
		out.println("<h1 align=center>����Java Servlet����</h1>"
				+"����: "+cString1+"<br />"
				+"����: "+cString2+"<br />"
				+"<br />"+today);
		
	}
	public void doPost(HttpServletRequest request, 
			HttpServletResponse response)
			throws IOException{

			response.setContentType("text/html;charset=utf-8");
//			response.setCharacterEncoding("utf8");
			request.setCharacterEncoding("utf8");
			PrintWriter out = response.getWriter();
			out.println("���!!");
			String c = request.getParameter("color");
			out.println("<br>��ѡ�����ɫ�ǣ� "+"<b>"+c+"</b>");

}
}
