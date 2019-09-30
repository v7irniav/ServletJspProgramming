package com.mycompany.web.contextlistener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
	//ServletContextListener 어플리케이션을 만들때 뭘 해야 되겠다 언 디플로이 할때 뭐 해야되겠다 할때 사용한다
	//ServletContextListener의 뜻은 생성될때
	
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {//디플로이 서버에 배치 할대
		System.out.println("contextInitialized run...");//톰캣에서 실행하면 애가 실행
		ServletContext application = sce.getServletContext();
		String contextConfigLocation = application.getInitParameter("contextConfigLocation");
		System.out.println(contextConfigLocation + "을 읽고 Spring WebApplicationContext를 구성합니다.");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {//언디플로이 할대 
		System.out.println("contextDestroyed run...");//톰캣에서 서버에서 끄면 애가 출력
	}
}
