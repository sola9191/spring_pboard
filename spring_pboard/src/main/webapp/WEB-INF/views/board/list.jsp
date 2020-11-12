<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/layout/header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pboard</title>
</head>
<body>
<article>
	<div class="container">
		<h2>board list</h2>
		<div class="table-responsive">
			<table class="table table-striped table-sm">
				<colgroup>
					<col style="width:15%;" />
					<col style="width:40%;" />
					<col style="width:15%;" />
					<col style="width:15%;" />
					<col style="width:15%;" />
				</colgroup>
				<thead>
					<tr>
						<th>NO</th>
						<th>글제목</th>
						<th>작성자</th>
						<th>조회수</th>
						<th>작성일</th>
					</tr>
				</thead>
				<tbody>
					<c:choose>
						<c:when test="${empty boardList }" >
							<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
						</c:when> 
						<c:when test="${!empty boardList}">
							<c:forEach var="list" items="${boardList}">
								<tr>
									<td><c:out value="${list.pno}"/></td>
									<td><a href="<%=request.getContextPath()%>/board/detail?pno=${list.pno}"><c:out value="${list.ptitle}"/></a></td>
									<td><c:out value="${list.pname}"/></td>
									<td><c:out value="${list.pcnt}"/></td>
									<td><c:out value="${list.pdate}"/></td>
								</tr>
							</c:forEach>
						</c:when>
					</c:choose>
				</tbody>
			</table>
		</div>
		<div class="text-right">
			<a href="<%=request.getContextPath()%>/board/write" class="btn btn-primary">글쓰기</a>
		</div>
	</div>
</article>
</body>
</html>
