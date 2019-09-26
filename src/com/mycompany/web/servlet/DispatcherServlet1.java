package com.mycompany.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet1 extends HttpServlet{
	//필드
	//x와 y를 밑에 service메소드에서 사용하기 위해서 필드로 사용 한다
	private String x;
	private String y;
	
	
	@Override
	//서블릿은 생성자를 일부로 만들지 않고 초기화 할 내용이 있다면 init에서 한다
	//서블릿은 준비할것이 많기 때문에 생성자에서는 준비 전이고 init은 준비가 다 되고 실행되므로
	//init을 사용한다. 사용자가 임의적으로 주고 싶은 정보가 있을경우 예를 들어 내가 지정하는 폴더에다가 파일을 저장해라 등등
	//개발자가 실행할때 필요한 정보를 줄테니 내부적으로 사용할때 init에서 받아서 사용하라
	//서비스는 클라이언트는 요청할때 마다 실행한다 init은 서블릿이 객체로 만들어 질대 딱 한번 실행된다.
	public void init(ServletConfig config) throws ServletException {//init은 생성자가 말고 초기화를 해주는 것이다  
		System.out.println("init(ServletConfig config) run...");
		
		x = config.getInitParameter("x");//web.xml의 param 이름이다
		y = config.getInitParameter("y");
		//config는 위에 x의 메게값을 받아서 저장해라
		//이렇게 하는 이유는 나중에 값이 변경될때 커파일은 한번만 하면 되고 xml에서 값만 살짝 살짝 바꿔 주면 되므로 이 방법을 쓴다.
		System.out.println("전달 받은 x 값 " + x);
		System.out.println("전달 받은 y 값 " + y);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//요청을 처리 하는 메소드 이다
		System.out.println("DispatcherServlet service run...");
		int xValue = Integer.parseInt(x);
		int yValue = Integer.parseInt(y);
		int result = xValue + yValue;
		System.out.println("result : " + result);
	}

}
