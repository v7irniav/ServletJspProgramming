<%@ page  contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html><!--톰캣이 이런것은 자바로 바꾼다.   -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h4>dispatcher6.jsp</h4>
		
		<!-- How1 --><!--주석이긴 하나 클라이언트로 간다 브라우저가 렌더링 하지 말아라 할때 사용한다 -->
		<%-- How1 --%><%--jsp주석이다 응답을 만들때 이부분은 빠진다 즉 완전한 주석--%>
		<%-- 똑같은 주석이긴 하다 현재 이 주석이 좋다 --%>
		
		title : <%=request.getAttribute("title")%> <br/><%--name에 저장되어 있는 값을 가져와라 --%>
		content : <%=request.getAttribute("content")%><br/><br/><%--age에 저장되어 있는 값을 가져와라 --%>
		<%--세미콜론을 붙이면 안된다. --%>
		
		<%-- How2(Expression Language --%>
		title : ${title}<br/><%-- name에 하는 값을 ${ } 에 출력하라--%>
		content : ${content}<br/><%-- age에 하는 값을 ${ } 에 출력하라--%>
		
	</body>
</html>