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
			<h2>board edit</h2>
			<form method="post" action="${pageContext.request.contextPath}/board/edit" id="editForm" enctype="multipart/form-data">
				<input type="hidden" id="pno" name="pno" value="${BoardVO.pno}">
				<div class="mb-3">
					<label for="pname">작성자</label>
					<input type="text" class="form-control" name="pname" id="pname" 
					value="${BoardVO.pname}" placeholder="이름을 입력해 주세요" readonly>
				</div>
				<div class="mb-3">
					<label for="ppass">비밀번호</label>
					<input type="password" class="form-control" name="ppass" id="ppass" 
					placeholder="비밀번호를 입력해 주세요">
				</div>				
				<div class="mb-3">
					<label for="ptitle">제목</label>
					<input type="text" class="form-control" name="ptitle" id="ptitle" 
					value="${BoardVO.ptitle}" placeholder="제목을 입력해 주세요">
				</div>				
				<div class="mb-3">
					<label for="pcontent">내용</label>
					<textarea class="form-control" rows="5" name="pcontent" id="pcontent">${BoardVO.pcontent}</textarea>
				</div>
				<div class="mb-3">
					<label for="ptag">TAG</label>
					<input type="text" class="form-control" name="ptag" id="ptag" 
					value="${BoardVO.ptag}" placeholder="태그를 입력해 주세요">
				</div>	
				<div class="mb-3">
					<label for="file">파일업로드</label>
					<input type="file" class="form-control" name="file" id="file">
				</div>		
				<div class="text-right">
					<input type="submit" class="btn btn-sm btn-primary" value="글수정" >
					<a href ="<%=request.getContextPath()%>/board/list" class="btn btn-sm btn-success">글목록</a>
				</div>
			</form>
		</div>
	</article>
<script>
	$(document).ready(function(){
		$("#editForm").submit(function(){
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

