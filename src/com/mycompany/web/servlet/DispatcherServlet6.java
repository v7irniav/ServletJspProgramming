package com.mycompany.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet6 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Dispatcher6 doGet 실행");
			//데이터는 request에서 받아야 한다
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		//리퀘스트에 저장하는 이유는 /WEB-INF/view/dispatcher5.jsp에서 데이터를 사용하려면 맞바로 줄수 있는 방법이 없다
		//공유객체(하나의 객체를 여기도 쓰고 저기도 쓰는것)즉 리퀘스트가 공유객체이다
		//공유 객체를 jps로 어떻게 넘기면 rd.forward(request, response);를 사용해서 가능하다
		
		
		
		request.setAttribute("title", title);
		request.setAttribute("content", content);

		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
		rd.forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Dispatcher6 doPost 실행");
			//데이터는 request에서 받아야 한다
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		//리퀘스트에 저장하는 이유는 /WEB-INF/view/dispatcher5.jsp에서 데이터를 사용하려면 맞바로 줄수 있는 방법이 없다
		//공유객체(하나의 객체를 여기도 쓰고 저기도 쓰는것)즉 리퀘스트가 공유객체이다
		//공유 객체를 jps로 어떻게 넘기면 rd.forward(request, response);를 사용해서 가능하다
		
		
		
		request.setAttribute("title", title);
		request.setAttribute("content", content);

		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher6.jsp");
		rd.forward(request, response);
		
	}
}
