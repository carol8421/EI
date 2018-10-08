<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<link href="css/style.css" rel="stylesheet" type="text/css" />


<link rel="css/stylesheet" href="css/style1.css">
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
<style type="text/css">
/* CSS Document */
body {
	font: normal 11px auto "Trebuchet MS", Verdana, Arial, Helvetica,
		sans-serif;
	color: #4f6b72;
	background: #E6EAE9;
}

a {
	color: #c75f3e;
}

#mytable {
	width: 700px;
	padding: 0;
	margin: 0;
}

caption {
	padding: 0 0 5px 0;
	width: 700px;
	font: italic 11px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
	text-align: right;
}

th {
	font: bold 11px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
	color: #4f6b72;
	border-right: 1px solid #C1DAD7;
	border-bottom: 1px solid #C1DAD7;
	border-top: 1px solid #C1DAD7;
	letter-spacing: 2px;
	text-transform: uppercase;
	text-align: left;
	padding: 6px 6px 6px 12px;
	background: #CAE8EA no-repeat;
}
/*power by www.winshell.cn*/
th.nobg {
	border-top: 0;
	border-left: 0;
	border-right: 1px solid #C1DAD7;
	background: none;
}

td {
	border-right: 1px solid #C1DAD7;
	border-bottom: 1px solid #C1DAD7;
	background: #fff;
	font-size: 11px;
	padding: 6px 6px 6px 12px;
	color: #4f6b72;
}

td.alt {
	background: #F5FAFA;
	color: #797268;
}

th.spec {
	border-left: 1px solid #C1DAD7;
	border-top: 0;
	background: #fff no-repeat;
	font: bold 10px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
}

th.specalt {
	border-left: 1px solid #C1DAD7;
	border-top: 0;
	background: #f5fafa no-repeat;
	font: bold 10px "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif;
	color: #797268;
}
}
</style>

<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">股东</a></li>
		</ul>
	</div>


	<div class="rightinfo">

		<div class="tools">

			<ul class="toolbar">
				<li><span><img src="images/t01.png" /></span><a
					href="${pageContext.request.contextPath}/.action?uuid=${uuid}">公司信息</a></li>
				<li><span><img src="images/t02.png" /></span><a
					href="${pageContext.request.contextPath}/.action?uuid=${uuid}">股东信息</a></li>
				<li><span><img src="images/t03.png" /></span><a
					href="${pageContext.request.contextPath}/.action?uuid=${uuid}">高管信息</a></li>
				<li><span><img src="images/t04.png" /></span><a
					href="${pageContext.request.contextPath}/.action?uuid=${uuid}">图示</a></li>
			</ul>


			<ul class="toolbar1">
				<li><span><img src="images/t05.png" /></span>空</li>
			</ul>

		</div>
		<center>
			<table id="mytable" cellspacing="0"
				summary="The technical specifications of the Apple 	PowerMac G5 series">
				<caption></caption>
				<tr>
					<th scope="col" scope="row">股东类型</th>
					<td>${tCorpStock.stockType }</td>
				</tr>
				<tr>
					<th scope="col" scope="row">股东国别</th>
					<td>${tCorpStock.country }</td>
				</tr>
				<tr>
					<th scope="col" scope="row">证件类型</th>
					<td>${tCorpStock.certificateType }</td>
				</tr>
				<tr>
					<th scope="col" scope="row">证件编号</th>
					<td>${tCorpStock.certificateNo }</td>
				</tr>
				<tr>
					<th scope="col" scope="row">股东名称</th>
					<td>${tCorpStock.stockName }</td>
				</tr>
				<tr>
					<th scope="col" scope="row">股东认缴币种</th>
					<td>${tCorpStock.stockCapiType }</td>
				</tr>
				<tr>
					<th scope="col" scope="row">股东认缴（万）</th>
					<td>${tCorpStock.stockCapi }</td>
				</tr>
				<tr>
					<th scope="col" scope="row">股东认缴额折美元（万元）</th>
					<td>${tCorpStock.stockCapiDollar }</td>
				</tr>
				<tr>
					<th scope="col" scope="row">股东认缴额折人民币（万元）</th>
					<td>${tCorpStock.stockCapiRmb }</td>
				</tr>
				<tr>
					<th scope="col" scope="row">出资百分比</th>
					<td>${tCorpStock.stockPercent }</td>
				</tr>
				<tr>
					<th scope="col" scope="row">对人民币的汇率</th>
					<td>${tCorpStock.stockRateRmb }</td>
				</tr>
				<tr>
					<th scope="col" scope="row">对美元的汇率</th>
					<td>${tCorpStock.stockRateDollar }</td>
				</tr>
				<tr>
					<th scope="col" scope="row">创建时间</th>
					<td><fmt:formatDate value="${tCorpStock.createDate}"
							pattern="yyyy-MM-dd HH:mm:ss" /></td>
				</tr>
			</table>
		</center>
	</div>
</body>
</html>
