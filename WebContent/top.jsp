<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="js/jquery.js"></script>
<script type="text/javascript">
$(function(){	
	//顶部导航切换
	$(".nav li a").click(function(){
		$(".nav li a.selected").removeClass("selected")
		$(this).addClass("selected");
	})	
})	
</script>


</head>

<body style="background:url(images/topbg.gif) repeat-x;">

    <div class="topleft">
    <a href="main.jsp" target="_parent"><img src="images/logo.png" title="系统首页" /></a>
    </div>
        
    <ul class="nav">
    <li><a href="default.jsp" target="rightFrame" class="selected"><img src="images/icon01.png" title="快速查询" /><h2>快速查询</h2></a></li>
    <li><a href="${pageContext.request.contextPath }/tcorplist.action" target="rightFrame"><img src="images/icon02.png" title="公司" /><h2>公司</h2></a></li>
    <li><a href="${pageContext.request.contextPath }/tcorpstockList.action"  target="rightFrame"><img src="images/icon03.png" title="股东" /><h2>股东</h2></a></li>
    <li><a href="${pageContext.request.contextPath }/tcorppertainslist.action"  target="rightFrame"><img src="images/icon04.png" title="高管" /><h2>高管</h2></a></li>
    <li><a href="relation.jsp" target="rightFrame"><img src="images/icon05.png" title="疑似关系" /><h2>疑似关系</h2></a></li>
    
    </ul>
            
   
</body>
</html>
