<%@ page  contentType="text/html; charset=UTF-8"%>
<%@ page import="com.mycompany.web.dto.Counter" %><!--jsp 임포트  -->
<%@ page import="java.util.*" %>
<!DOCTYPE html><!--톰캣이 이런것은 자바로 바꾼다.   -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h4>dispatcher8.jsp</h4>
		
		<%-- How1 --%><%--10년전에는 했지만 요즘에는 이렇게 사용 안한다  --%>
		<%Counter applicationCounter = (Counter)application.getAttribute("applicationCounter"); %>
		applicationCounter : <%=applicationCounter.getValue() %><br/>
		<%-- 방문자 카운팅은 어플리케이션 --%>
		<%Counter sessionCounter = (Counter)session.getAttribute("sessionCounter"); %>
		sessionCounter : <%=sessionCounter.getValue() %><br/>
		<%-- 장바구니 객체는 섹션에 저장하는게 좋다 --%>
		<%-- 로그인 정보 --%>
		<%Counter requestCounter = (Counter)request.getAttribute("requestCounter"); %>
		requestCounter : <%=requestCounter.getValue() %><br/><br/>
		
		<%-- How2(Expression Language --%><%--이거 많이 쓴다 --%>
		applicationCounter : ${applicationCounter.value}<br/><%-- $다음은 키 이름  . 다음은 메소드(겟터를 호출한건다) --%>
		sessionCounter : ${sessionCounter.value}<br/>
		requestCounter : ${requestCounter.value}<br/><br/>
		
	</body>
</html>