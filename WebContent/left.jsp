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
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>


</head>

<body style="background:#f0f9fd;">
	<div class="lefttop"><span></span>快捷目录</div>
    
    <dl class="leftmenu">
        
    <dd>
    <div class="title">
    <span><img src="images/leftico01.png" /></span>公司信息
    </div>
    	<ul class="menuson">
        
        <li class="active"><cite></cite><a href="default.jsp" target="rightFrame">快捷查询</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath }/tcorplist.action" target="rightFrame">公司信息</a><i></i></li>
        
        </ul>    
    </dd>
        
    
    <dd>
    <div class="title">
    <span><img src="images/leftico02.png" /></span>股东信息
    </div>
    <ul class="menuson">
        <li><cite></cite><a href="default.jsp" target="rightFrame">快捷查询</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath }/tcorpstockList.action" target="rightFrame">股东信息</a><i></i></li>
        
        </ul>     
    </dd> 
    
    
    <dd><div class="title"><span><img src="images/leftico03.png" /></span>高管信息</div>
    <ul class="menuson">
        <li><cite></cite><a href="default.jsp" target="rightFrame">快捷查询</a><i></i></li>
        <li><cite></cite><a href="${pageContext.request.contextPath }/tcorppertainslist.action" target="rightFrame">高管信息</a><i></i></li>
        
    </ul>    
    </dd>  
    
    
    <dd><div class="title"><span><img src="images/leftico04.png" /></span>疑似关系</div>
    <ul class="menuson">
        <li><cite></cite><a href="relation.jsp" target="rightFrame">疑似关系查询</a><i></i></li>
        
    </ul>
    
    </dd>   
    
    </dl>
</body>
</html>
