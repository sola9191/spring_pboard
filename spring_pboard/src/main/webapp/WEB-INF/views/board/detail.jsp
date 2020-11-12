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
	<article>
		<div class="container" role="main">
			<h2>board detail</h2>
				<div class="mb-3">
					<span>작성자</span>
					<p>${BoardVO.pname}</p>
				</div>				
				<div class="mb-3">
					<span>글제목</span>
					<p>${BoardVO.ptitle}</p>
				</div>
				<div class="mb-3">
					<span>글내용</span>
					<p>${BoardVO.pcontent}</p>
				</div>
				<div class="mb-3">
					<span>글태그</span>
					<p>${BoardVO.ptag}</p>
				</div>	
				<div class="mb-3">
					<span>파일</span>
					<p><img src="<%=request.getContextPath()%>/upload/${BoardVO.pfile}" /></p>
				</div>	
				<div class="text-right">	
					<a href="<%=request.getContextPath()%>/board/edit?pno=${BoardVO.pno}" class="btn btn-sm btn-primary">글수정</a>
					<a href="<%=request.getContextPath()%>/board/delete?pno=${BoardVO.pno}" class="btn btn-sm btn-success">글삭제</a>
					<a href="<%=request.getContextPath()%>/board/list" class="btn btn-sm btn-warning">글목록</a>
				</div>
		</div>
	</article>
<script>

if("${edit}"=="pass") {alert("글수정에 성공했습니다");}
if("${edit}"=="fail") {alert("글수정에 실패했습니다");}

</script>
</body>
</html>
