package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examplev.ColorChoose;

public class Ch1Servlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request, 
					HttpServletResponse response)
					throws IOException, ServletException{
		
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
		SimpleDateFormat dateFormat = new SimpleDateFormat("日期 yyyy年M月d日 -- 时间 HH:mm:ss");
		String today = dateFormat.format(new java.util.Date());
		request.setAttribute("today", today);
		String cString1 = request.getParameter("param1");
		request.setAttribute("param1", cString1);
		cString1 = new String(cString1.getBytes("ISO-8859-1"), "utf-8");
		String cString2 = request.getParameter("param2");
		request.setAttribute("param2", cString2);
//		String foo = getServletContext().getInitParameter("foo");
//		String email = getServletContext().getInitParameter("adminEmail");
//		Dog dog = (Dog) getServletContext().getAttribute("dog");
//		out.println("<h1 align=center>关于Java Servlet例子</h1>"
//				+"姓名: "+cString1+"<br />"
//				+"密码: "+cString2+"<br />"
//				+"foo: "+foo+"<br />"
//				+"adminEmail: "+email+"<br />"
//				+ dog.getBreed() +"<br />"
//				+"<br />"+today);
		RequestDispatcher view = request.getRequestDispatcher("getresult.jsp");
		view.forward(request, response);
		
	}
	public void doPost(HttpServletRequest request, 
			HttpServletResponse response)
			throws IOException, ServletException{

//			response.setContentType("text/html;charset=utf-8");
//			request.setCharacterEncoding("utf8");
//			PrintWriter out = response.getWriter();
//			out.println("你好!!");
//			String c = request.getParameter("color");
//			out.println("<br>你选择的颜色是： "+"<b>"+c+"</b>");
			String c = request.getParameter("color");
			c = new String(c.getBytes("ISO-8859-1"), "utf-8");
			ColorChoose cc = new ColorChoose();
			List result = cc.getColor(c);
			request.setAttribute("styles", result);
			request.setAttribute("color", c);
			RequestDispatcher view = request.getRequestDispatcher("result.jsp");
			view.forward(request, response);

}
}
