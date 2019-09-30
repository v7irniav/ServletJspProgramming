package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mycompany.web.dto.Counter;

public class DispatcherServlet8 extends HttpServlet {//저장만 하는 코드
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//application 범위에서 객체 가져오기
		ServletContext sc = request.getServletContext();
		Counter applicationCounter = (Counter) sc.getAttribute("applicationCounter");//강제 타입 변환 해야 된다
		if(applicationCounter != null) {//applicationCounter키로 값이 저장되어 있지 않다면 저장이 안되므로 조건을 단다
			applicationCounter.setValue(applicationCounter.getValue() + 1);//현재 값에다가 1을 더해서 다시 저장하는것
			System.out.println("applicationCounter : " + applicationCounter.getValue());//지금 현재의 벨류가 얼마인가
		}
		
		
		
		//session 범위에서 객체 가져오기
		HttpSession session = request.getSession();
		Counter sessionCounter = (Counter) session.getAttribute("sessionCounter");//강제 타입 변환 해야 된다
		if(sessionCounter != null) {
			sessionCounter.setValue(sessionCounter.getValue() + 1);
			System.out.println("sessionCounter : " + sessionCounter.getValue());
		}
		
		
		//request 범위에서 객체 가져오기
		Counter requestCounter = (Counter)request.getAttribute("requestCounter");
		if(requestCounter != null) {
			requestCounter.setValue(requestCounter.getValue() + 1);
			System.out.println("requestCounter : " + requestCounter.getValue());
		}
		
		//forward
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/dispatcher8.jsp");
		rd.forward(request, response);
		
		
				
		
		
	}

}
