package com.mycompany.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//필터를 넣을려면 반드시 인터페이스를 하나 구현해야 한다
public class CharacterEncodingFilter implements Filter{
	private String encoding;//필드 
	
	
	
	
	@Override 
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("CharacterEncodingFilter init run...");
		encoding = filterConfig.getInitParameter("encoding");//파라미터 이름으로 초기값을 받아와라
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("CharacterEncodingFilter doFilter run...");
		//전처리
		request.setCharacterEncoding(encoding);
		//서블릿으로 이동
		chain.doFilter(request, response);//다음피터가 있으면 다음필터 내용을 처리해야 다음필터가 없다면 서블릿을 처리하라
		//서블릿이 사용할수 있도록request, response를 넣어준다
	}

}
