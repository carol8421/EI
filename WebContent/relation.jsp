<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/style1.css">
<script type="text/javascript" src="js/jsapi.js"></script>
<script type="text/javascript"
	src="js/format+zh_CN,default,corechart.I.js"></script>
<script type="text/javascript" src="js/jquery.gvChart-1.0.1.min.js"></script>
<script type="text/javascript" src="js/jquery.ba-resize.min.js"></script>

<script type="text/javascript">
	gvChartInit();
	jQuery(document).ready(function() {

		jQuery('#myTable5').gvChart({
			chartType : 'PieChart',
			gvSettings : {
				vAxis : {
					title : 'No of players'
				},
				hAxis : {
					title : 'Month'
				},
				width : 650,
				height : 250
			}
		});
	});
</script>
</head>

<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">关系查询</a></li>
		</ul>
	</div>


	<div class="mainbox">
		<form
			action="${pageContext.request.contextPath }/ApproximateRelation.jsp"
			method="post">
			<div class="searchbox">
				<input type="text" name="searchPlaceholder" id="searchPlaceholder" placeholder="请输入公司或人的名称 " autocomplete="on"
					class="import">


			</div>
			<div class="searchbox">


				<input type="text" name="searchPlaceholder" id="searchPlaceholder" placeholder="请输入公司或人的名称" autocomplete="on"
					class="import"> <input type="submit" value="搜   索"
					class="btn-search">

			</div>
		</form>
	</div>



</body>
<script type="text/javascript">
	setWidth();
	$(window).resize(function() {
		setWidth();
	});
	function setWidth() {
		var width = ($('.leftinfos').width() - 12) / 2;
		$('.infoleft,.inforight').width(width);
	}
</script>
</html>
