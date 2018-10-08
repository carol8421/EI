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
		jQuery(document).ready(function(){

		jQuery('#myTable5').gvChart({
				chartType: 'PieChart',
				gvSettings: {
					vAxis: {title: 'No of players'},
					hAxis: {title: 'Month'},
					width: 650,
					height: 250
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
			<li><a href="#">快速查询</a></li>
		</ul>
	</div>


	<div class="mainbox">
		<div class="searchbox">
			<div class="mod_select">
				<div class="select_box">
					<span class="select_txt">公司</span> <span class="select-icon"></span>
					<ul class="option">
						<li>公司</li>
						<li>股东</li>
						<li>高管</li>
					</ul>
				</div>
			</div>
			<form	action="${pageContext.request.contextPath }/AdvancedQuery.action"	method="post">
				<input type="hidden" name="select_value" value="公司" 	id="select_value">
				<input type="text" 	name="searchPlaceholder" id="searchPlaceholder" class="import"	placeholder="请输入公司名称" autocomplete="on"> 
				<input type="submit" value="搜   索" class="btn-search">
			</form>
		</div>
		<script src="js/jquery.min.js"></script>
		<script>
    $(function(){
        $(".select_box").click(function(event){   
            event.stopPropagation();
            $(this).find(".option").toggle();
            $(this).parent().siblings().find(".option").hide();
        });
        $(document).click(function(event){
            var eo=$(event.target);
            if($(".select_box").is(":visible") && eo.attr("class")!="option" && !eo.parent(".option").length)
            $('.option').hide();                                    
        });
        $(".option li").click(function(){
            var check_value=$(this).text();
            var zlValue = $('.option li:eq(1)').html();
            var bqValue = $('.option li:eq(2)').html();
            $(this).parent().siblings(".select_txt").text(check_value);
            $("#select_value").val(check_value);
            if(check_value == zlValue) {
                $('#searchPlaceholder').prop('placeholder','请输入股东名称');
            }else if(check_value == bqValue) {
                $('#searchPlaceholder').prop('placeholder','请输入高管名称');
            }else {
                $('#searchPlaceholder').prop('placeholder','请输入公司名称');
            }
        });
    })
  </script>


	</div>



</body>
<script type="text/javascript">
	setWidth();
	$(window).resize(function(){
		setWidth();	
	});
	function setWidth(){
		var width = ($('.leftinfos').width()-12)/2;
		$('.infoleft,.inforight').width(width);
	}
</script>
</html>
