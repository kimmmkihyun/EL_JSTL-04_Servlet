<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
	function movePage() {
		//alert("1");
	location.href = "Request.do";    //location 방식 => get 방식
	
	}

</script>  
request.jsp<br>

<a href="Request.do">링크</a>  <!-- a태그 => get 방식 -->
<!-- http://localhost:8080/04_Servlet/Request.do -->

<!-- href="/Request.do"로 입력할 경우 => http://localhost:8080/Request.do -->
<br>

<input type="button" value="버튼" onClick="movePage()"/>

<br><br>


<form action="Request.do" method="get">
	<input type="submit" value="get전송">
</form>
<br>

<form action="Request.do" method="post">
	<input type="submit" value="post전송">
</form>
<br>





