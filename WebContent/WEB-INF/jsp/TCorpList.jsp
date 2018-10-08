<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>企业基本信息</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/style1.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script language="javascript">
$(function(){	
	//导航切换
	$(".imglist li").click(function(){
		$(".imglist li.selected").removeClass("selected")
		$(this).addClass("selected");
	})	
})	
</script>
<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">公司</a></li>
		</ul>
	</div>


	<div class="rightinfo">


		<div class="mainbox">
			<div class="searchbox">
				<div class="mod_select">
					<div class="select_box">
						<span class="select_txt">公司</span> <span class="select-icon"></span>
						<ul class="option">
							<li>公司</li>
						</ul>
					</div>
				</div>
				<form
					action="${pageContext.request.contextPath}/seletetcorp.action"
					method="post">
					<input type="hidden" name="select_value" value="公司"
						id="select_value">
					<input type="text"
						name="searchPlaceholder" id="searchPlaceholder" class="import"
						placeholder="请输入公司名称">
					<input type="submit" value="搜   索"
						class="btn-search">
				</form>
			</div>



		</div>

		<table class="imgtable">

			<thead>
				<tr>
					<th width="100px;">企业名称</th>
					<th>所属地区</th>
					<th>所属行业</th>
					<th>公司类型</th>
					<th>法人代表名称</th>
					<th>邮箱</th>
					<th>点击</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${tcorpList }" var="tCorp">
					<tr>

						<td><a
							href="${pageContext.request.contextPath }/seletecorp.action?uuid=${tCorp.uuid}">${tCorp.corpName}</a>
							<p>发布时间：2013-10-12 09:25:18</p></td>
						<td>${tCorp.belongDistOrg }</td>
						<td>${tCorp.belongTrade}</td>
						<td>${tCorp.econKind}</td>
						<td>${tCorp.operManName }</td>
						<td>${tCorp.email }</td>
						<td><a href="${pageContext.request.contextPath }/seletecorp.action?uuid=${tCorp.uuid}">查看</a></td>
					</tr>
				</c:forEach>

			</tbody>

		</table>
	</div>
</body>
</html>
