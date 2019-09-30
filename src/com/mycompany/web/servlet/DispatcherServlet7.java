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

public class DispatcherServlet7 extends HttpServlet {//저장만 하는 코드
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//application 범위
		
		
		ServletContext sc = request.getServletContext();
		if(sc.getAttribute("applicationCounter") == null) {//null경우에만 만들어서 저장된다. 키가 존재할때는 덮어 쓰면 안된다.
		Counter applicationCounter = new Counter();
		sc.setAttribute("applicationCounter", applicationCounter);//applicationCounter 객체를 counter라는 키에 저장한다
		}
		
		
		//session 범위
		
		HttpSession session = request.getSession();
		if(session.getAttribute("sessionCounter") == null) {
		Counter sessionCounter = new Counter();
		session.setAttribute("sessionCounter", sessionCounter);
		}
		
		//request 범위 //응답과 요청사이에 실행 가능한것//누적이 안된다 응답하면 바로 사라진다
		//객체 가져오기 눌렀을때는 안나온다.
		if(request.getAttribute("requestCounter") == null) {
		Counter requestCounter = new Counter();
		request.setAttribute("requestCounter", requestCounter);
		}
		
		//forward
		RequestDispatcher rd = request.getRequestDispatcher("/dispatcher8");
		rd.forward(request, response);
		
		
	}

}
