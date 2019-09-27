<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JavaScriptProgramming</title>
<style type="text/css">
body, html {
	height: 100%;
}

#wrapper {
	width: 100%;
	height: 100%;
	display: flex;
	flex-direction: column;
}

#header {
	border-bottom: 1px solid black;
	margin-bottom: 10px;
}

#content {
	flex-grow: 1;
	height: 80%;
	display: flex;
}

#sideBar {
	width: 300px;
	background-color: lightgray;
	padding-right: 10px;
	border-right: 1px solid black;
	overflow-y: scroll;/*넘칠경우에 스크롤이 나오게 해주겠따 */
}

#center {
	flex-grow: 1;
	padding: 10px;
}

#center iframe {
	margin-top: 0px;
	width: 100%;
	height: 100%;
}

#footer {
	border-top: 1px solid black;
	margin-top: 10px;
	margin-bottom: 10px;
}
</style>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>ServletJspProgramming</h3>
		</div>
		<div id="content">
			<div id="sideBar">
				<ul>
					<li><a href="dispatcher1" target="iframe">서블릿 작성과 URL 매핑</a></li>
					<li><a href="dispatcher2" target="iframe">서블릿 초기화</a></li>
					<li><a href="dispatcher3?name=hongkildong&age=25&tel=0101231234" target="iframe">GET 방식으로 요청</a></li>
					<!--이건 겟방식으로 요청한다  -->
					<li>
						<form action="dispatcher3" method="get" target="iframe">
							<!-- method ="get"이것을 생략하면 디폴트 값은 get이다 -->
							<input type="text" name="name" value="hongkildong" /> 
							<input type="number" name="age" value="25" /> 
							<input type="tel" name="tel" value="010-123-12345" /> 
							<input type="submit" value="GET 방식으로 요청" />
						</form>
						<form action="dispatcher3" method="post" target="iframe">
							<!--dispatcher3이것을 요청한다 요청 방식은 POST 이다  -->
							<input type="text" name="name" value="hongkildong" /> 
							<input type="number" name="age" value="25" /> 
							<input type="tel" name="tel" value="010-123-12345" /> 
							<input type="submit" value="POST 방식으로 요청" />
							<!--버튼을 생성하는것  -->
						</form>
					</li>
						<li><a href="dispatcher4" target="iframe">응답 보내기</a></li>
						<li><a href="dispatcher5?name=hongkildong&age=25" target="iframe">요청 파라미터 받기</a>
					</li>
					<li>
					<form action="dispatcher5" method="get" target="iframe">
							<input type="text" name="name" value="hongkildong" /> 
							<input type="number" name="age" value="25" /> 
							<input type="submit" value="GET 방식으로 요청" />
						</form>
						<form action="dispatcher5" method="post" target="iframe">
							<input type="text" name="name" value="hongkildong" /> 
							<input type="number" name="age" value="25" /> 
							<input type="submit" value="POST 방식으로 요청" />
						</form>
					</li>
				</ul>
			</div>
			<div id="center">
				<iframe name="iframe" src="http://tomcat.apache.org" frameborder="0"></iframe>
			</div>
		</div>
		<div id="footer">2019. IoT. ëë³´</div>
	</div>
</body>
</html>