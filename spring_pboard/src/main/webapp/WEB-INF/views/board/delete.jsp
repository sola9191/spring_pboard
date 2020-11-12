<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
</head>
<body>
	<div class="container"  style="margin-top:5%; min-height:500px">
			<h3>board delete</h3>
			<form action="${pageContext.request.contextPath}/board/delete?pno=${pno}" method="post" id="deleteForm"> 
				<div class="form-group">
				  <label for="ppass"  >비밀번호</label>
				  <input type="password"   name="ppass"   id="ppass"   class="form-control" > 
				  <span>(*) 삭제시 필수입니다. </span>
				</div>
				<div class="form-group">
					<input type="submit" value=" 확 인 "   class="btn btn-danger" />
					<input type="reset"   onclick="history.go(-1);"  value="취소"    class="btn btn-info"  >  
				</div>	
			</form>
	</div>
	<script>
		jQuery(document).ready(function(){
			jQuery("#deleteForm").submit(function(){
				if(jQuery("#ppass").val()==""){
					alert("비밀번호을 입력해주세요");
					jQuery("#ppass").focus();
					return false;
				}
			});
		});
	</script>
</body>
</html>