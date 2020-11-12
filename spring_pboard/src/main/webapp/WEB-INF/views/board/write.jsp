<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
</head>
<body>
	<article>
		<div class="container" role="main">
			<h2>board write</h2>
			<form method="post" action="${pageContext.request.contextPath}/board/write" id="writeForm" enctype="multipart/form-data">
				<div class="mb-3">
					<label for="pname">작성자</label>
					<input type="text" class="form-control" name="pname" id="pname" placeholder="이름을 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="ppass">비밀번호</label>
					<input type="password" class="form-control" name="ppass" id="ppass" placeholder="비밀번호를 입력해 주세요">
				</div>				
				<div class="mb-3">
					<label for="ptitle">제목</label>
					<input type="text" class="form-control" name="ptitle" id="ptitle" placeholder="제목을 입력해 주세요">
				</div>
				<div class="mb-3">
					<label for="pcontent">내용</label>
					<textarea class="form-control" rows="5" name="pcontent" id="pcontent" placeholder="내용을 입력해 주세요" ></textarea>
				</div>
				<div class="mb-3">
					<label for="ptag">TAG</label>
					<input type="text" class="form-control" name="ptag" id="ptag" placeholder="태그를 입력해 주세요">
				</div>			
				<div class="mb-3">
					<label for="file">파일업로드</label>
					<input type="file" class="form-control" name="file" id="file">
				</div>
				<div class="text-right">
					<input type="submit" class="btn btn-sm btn-primary" value="글쓰기" >
					<a href ="<%=request.getContextPath()%>/board/list" class="btn btn-sm btn-success">목록</a>
				</div>
			</form>
		</div>
	</article>
<script>
	$(document).ready(function(){
		$("#writeForm").submit(function(){
			if($("#pname").val()==""){
				alert("이름을 입력해주세요");
				$("#pname").focus();
				return false;
			}
			if($("#ppass").val()==""){
				alert("비밀번호를 입력해주세요");
				$("#ppass").focus();
				return false;
			}
			if($("#ptitle").val()==""){
				alert("제목을 입력해주세요");
				$("#ptitle").focus();
				return false;
			}
			if($("#pcontent").val()==""){
				alert("내용을 입력해주세요");
				$("#pcontent").focus();
				return false;
			}
		});
	});
</script>
</body>
</html>

