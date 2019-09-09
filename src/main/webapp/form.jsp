<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
<form action="#">
	手机号:<input type="text" name="phone"/><br>
	邮箱:<input type="text" name="email"/><br>
	文本:<textarea rows="3" cols="25" name="html"></textarea><br>
	<input type="button" value="搜索" onclick="rule()"/>
</form>
<script type="text/javascript">
	function rule(){
		$.post("rule.do",$("form").serialize(),function(num){
			if (num == 1) {
				alert("手机号有误!")
			}else if(num == 2){
				alert("邮箱有误!")
			}else if(num == 3){
				alert("文本为空")
			}else if(num == 0){
				alert("验证成功!")
			}
		},"json")
	}
</script>
</body>
</html>