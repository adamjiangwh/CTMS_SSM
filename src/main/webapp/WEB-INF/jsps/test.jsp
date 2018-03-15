<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
	<title>test</title>
	<script type="text/javascript" src="${pageContext.request.contextPath }a_style/index/js/jquery.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#test").click(
				function() {
					$.ajax({
						url:"${pageContext.request.contextPath}/user/userlist",
						type:"post",
						dataType:"JSON",
						success: function(data){
							alert(data);
							console.log(data);
						}
					});
				}
			)
		});
	</script>
</head>
<body>
	<input type="button" value="test" id="test"/>
</body>
</html>