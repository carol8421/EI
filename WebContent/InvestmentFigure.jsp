<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>股权结构</title>
<script src="${pageContext.request.contextPath}/js/echarts.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"
	type="text/javascript"></script>
<script src="Chart/echarts.js" type="text/javascript"></script>
</head>
<body>

	<div id="main" style="width: 1000px; height: 800px;"></div>
	<script type="text/javascript">
		// 基于准备好的dom，初始化echarts实例
		var myChart = echarts.init(document.getElementById('main'));
		// 指定图表的配置项和数据
		// 使用刚指定的配置项和数据显示图表。
		var tcorp;
		var names = []; //类别数组（用于存放饼图的类别）
		var brower = [];
		option = {
			backgroundColor : '#2c343c',

			title : {
				text : '股权分布图',
				left : 'center',
				top : 20,
				textStyle : {
					color : '#ccc'
				}
			},

			tooltip : {
				trigger : 'item',
				formatter : "{a} <br/>{b} : {c} ({d}%)"
			},

			visualMap : {
				show : false,
				min : 80,
				max : 600,
				inRange : {
					colorLightness : [ 0, 1 ]
				}
			},
			series : [ {
				name : "股分分布",
				type : 'pie',
				radius : '55%',
				center : [ '50%', '50%' ],
				data : brower.sort(function(a, b) {
					return a.value - b.value;
				}),
				roseType : 'radius',
				label : {
					normal : {
						textStyle : {
							color : 'rgba(255, 255, 255, 0.3)'
						}
					}
				},
				labelLine : {
					normal : {
						lineStyle : {
							color : 'rgba(255, 255, 255, 0.3)'
						},
						smooth : 0.2,
						length : 10,
						length2 : 20
					}
				},
				itemStyle : {
					normal : {

						shadowBlur : 200,
						shadowColor : 'rgba(0, 0, 0, 0.5)'
					}
				},

				animationType : 'scale',
				animationEasing : 'elasticOut',
				animationDelay : function(idx) {
					return Math.random() * 200;
				}
			} ]
		};

		myChart.showLoading();
		$.ajax({
			url : '${pageContext.request.contextPath }/pie.action',
			type : 'get',
			dataType : "json",
			data : {
				"uuid" : '${param.uuid}'
			},
			success : function(data) {

				var result = data;

				$.each(result.data, function(index, item) {
					names.push(item.name); //挨个取出类别并填入类别数组 
					brower.push({
						name : item.name,
						value : item.equity
					});
				});

				myChart.hideLoading(); //隐藏加载动画
				myChart.setOption(option);

			},
			error : function(errorMsg) {

				alert("不好意思，大爷，图表请求数据失败啦!");

			}
		});
	</script>
</body>
</html>