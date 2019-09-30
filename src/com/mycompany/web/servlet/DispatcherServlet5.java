package com.mycompany.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet5 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//request는 요청이 왔을때 생성되고 응답(response)이 가면 소멸된다.
			//데이터는 request에서 받아야 한다
		String name = request.getParameter("name");//네임이라는 이름으로 값을 받겠다
		String age = request.getParameter("age");//에이지라는 이름으로 값을 받겠다
		//받을때는 다 문자로 받아야 한다
		int intAge = Integer.parseInt(age);
		
		request.setAttribute("name", name);//값을 받아 오는것
		request.setAttribute("age", intAge);//age 값//request 응답 가기전까진 존재 가면은 삭제
		
//		ServletContext servletContext = request.getServletContext();
//		servletContext.setAttribute("name", name);
//		servletContext.setAttribute("age", intAge);
		//servletContext는 응답이 가도 사라지지 않는다.
		

		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher5.jsp");
		rd.forward(request, response);
		
	}
}
