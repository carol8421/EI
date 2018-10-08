<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>股东/发起人信息</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/reset.css">
<link rel="stylesheet" href="css/style1.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script language="javascript">
	$(function() {
		//导航切换
		$(".imglist li").click(function() {
			$(".imglist li.selected").removeClass("selected")
			$(this).addClass("selected");
		})
	})
</script>
</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">股东</a></li>

		</ul>
	</div>

	<div class="rightinfo">

		
		<div class="mainbox">
			<div class="searchbox">
				<div class="mod_select">
					<div class="select_box">
						<span class="select_txt">股东</span> <span class="select-icon"></span>
						<ul class="option">
							<li>股东</li>
						</ul>
					</div>
				</div>
				<form
					action="${pageContext.request.contextPath }/seletetcorpstock.action"
					method="post">
					<input type="hidden" name="select_value" value="股东"
						id="select_value"> <input type="text"
						name="searchPlaceholder" id="searchPlaceholder" class="import"	placeholder="请输入股东名称"> <input type="submit" value="搜   索"
						class="btn-search">
				</form>
			</div>



		</div>

		<table class="imgtable">

			<thead>
				<tr>
					<th width="100px;">股东姓名</th>
					<th>股东类型</th>
					<th>股东国别</th>
					<th>证件类型</th>
					<th>点击</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${tCorpStockList}" var="tCorpStock">
					<tr>

						<td><a
							href="${pageContext.request.contextPath}/tcorpstockedit.action?uuid=${tCorpStock.uuid}">${tCorpStock.stockName }</a>
							<p>发布时间：2013-10-12 09:25:18</p></td>
						<td>${tCorpStock.stockType }</td>
						<td>${tCorpStock.country }</td>
						<td>${tCorpStock.certificateType }</td>
						<td><a href="WEB-INF/jsp/showTcorpStock.html">查看</a></td>
					</tr>
				</c:forEach>


			</tbody>

		</table>
	</div>
</body>
</html>
