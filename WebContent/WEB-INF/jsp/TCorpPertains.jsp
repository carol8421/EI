<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公司主要成员表</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/style1.css">
</head>

<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">高管</a></li>
		</ul>
	</div>


	<div class="rightinfo">

		
		<div class="mainbox">
			<div class="searchbox">
				<div class="mod_select">
					<div class="select_box">
						<span class="select_txt">高管</span> <span class="select-icon"></span>
						<ul class="option">
							<li>高管</li>
						</ul>
					</div>
				</div>
				<form
					action="${pageContext.request.contextPath}/seletetcorppertains.action"
					method="post">
					<input type="hidden" name="select_value" value="高管"
						id="select_value"> <input type="text"
						name="searchPlaceholder" id="searchPlaceholder" class="import"
						placeholder="请输入高管名称"> <input type="submit" value="搜   索"
						class="btn-search">
				</form>
			</div>



		</div>

		<table class="imgtable">

			<thead>
				<tr>
					<th width="100px;">成员姓名</th>
					<th>成员职务</th>
					<th>性别</th>
					<th>年龄</th>
					<th>国籍</th>
					<th>点击</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${TCorpPertains}" var="tcorppertains">
					<tr>

						<td><a
							href="${pageContext.request.contextPath }/tcorppertainsedit.action?uuid=${tcorppertains.uuid}">${tcorppertains.personName }</a>
						<p>发布时间：2013-10-12 09:25:18</p></td>
						<td>${tcorppertains.personType }</td>
						<td>${tcorppertains.sex }</td>
						<td>${tcorppertains.age }</td>
						<td>${tcorppertains.country }</td>
						<td><a href="${pageContext.request.contextPath }/tcorppertainsedit.action?uuid=${tcorppertains.uuid}">查看</a></td>
					</tr>
				</c:forEach>


			</tbody>

		</table>
	</div>
</body>
</html>
