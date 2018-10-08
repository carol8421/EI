<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> </title> 
</head> 
<link href="css/style.css" rel="stylesheet" type="text/css" />


<link rel="css/stylesheet" href="css/style1.css">
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
<style type="text/css"> 
/* CSS Document */ 

body { 
font: normal 11px auto "Trebuchet MS", Verdana, Arial, Helvetica, sans-serif; 
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
font-size:11px; 
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
    <li><a href="#">公司</a></li>
    </ul>
    </div>
  
	
	<div class="rightinfo">
    
    <div class="tools">
    
    	<ul class="toolbar">
        <li><a href="${pageContext.request.contextPath}/seletecorp.action?uuid=${tCorp.uuid}">公司信息</a></li>
        <li><a href="${pageContext.request.contextPath}/seletecorpstock.action?uuid=${tCorp.uuid}">股东信息</a></li>
        <li><a href="${pageContext.request.contextPath}/seletecorppertains.action?uuid=${tCorp.uuid}">高管信息</a></li>
        <li><span><img src="images/t04.png" /></span><a
			href="${pageContext.request.contextPath }/RelationalGraph.jsp?uuid=${tCorp.uuid}">关系图示</a></li>
		<li><span><img src="images/t04.png" /></span><a
			href="${pageContext.request.contextPath }/InvestmentFigure.jsp?uuid=${tCorp.uuid}">投资金额图示</a></li>
       
        <li><span><img src="images/t04.png" /></span><a
			href="${pageContext.request.contextPath }/map.jsp?uuid=${tCorp.uuid}">分公司地区分布图</a></li>
        </ul>
        
        <ul class="toolbar1">
        <li><span><img src="images/t05.png" /></span>空</li>
        </ul>
    
    </div>
<center>
<table id="mytable" cellspacing="0" summary="The technical specifications of the Apple 	PowerMac G5 series"> 
<caption> </caption> 
		<tr>
			<th scope="col" scope="row">统一社会信用代码</th>
			<td>${tCorp.regNo }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">企业名称</th>
			<td>${tCorp.corpName }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">登记机关</th>
			<td>${tCorp.belongOrg }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">所属地区</th>
			<td>${tCorp.belongDistOrg }</td>
		</tr>
		<tr>
			<th  scope="col" scope="row">所属行业</th>
			<td>${tCorp.belongTrade }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">公司类型</th>
			<td>${tCorp.econKind }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">企业大类</th>
			<td>${tCorp.admitMain }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">成立日期</th>
			<td></td>
		</tr>
		<tr>
			<th scope="col" scope="row">核准日期</th>
			<td></td>
		</tr>
		<tr>
			<th scope="col" scope="row">法人代表证件编号</th>
			<td>${tCorp.operManIdentNo }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">法人代表名称</th>
			<td>${tCorp.operManName }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">经营状态</th>
			<td>${tCorp.corpStatus }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">注册资金（万元）</th>
			<td>${tCorp.regCapi }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">经营期限起</th>
			<td></td>
		</tr>
		<tr>
			<th scope="col" scope="row">经营期限止</th>
			<td>${tCorp.fareTermEnd }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">经营范围</th>
			<td>${tCorp.fareScope }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">注册号</th>
			<td>${tCorp.uniScid }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">电话</th>
			<td>${tCorp.tel }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">官网</th>
			<td>${tCorp.webUrl }</td>
		</tr>
		<tr>
			<th scope="col" scope="col" scope="row">邮箱</th>
			<td>${tCorp.email }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">从业人员</th>
			<td>${tCorp.pracPersonNum }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">组织机构代码</th>
			<td>${tCorp.orgInstCode }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">纳税人识别号</th>
			<td>${tCorp.taxpayNum }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">人员规模</th>
			<td>${tCorp.staffSize }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">英文名</th>
			<td>${tCorp.englishName }</td>
		</tr>
		<tr>
			<th scope="col" scope="row">创建时间</th>
			<td>${tCorp.createDate}</td>
		</tr>
		<tr>
			<th scope="col" scope="row">创建机构代码</th>
			<td>${tCorp.createOrg }</td>
		</tr>
</table>
</center>
</body> 
</html> 