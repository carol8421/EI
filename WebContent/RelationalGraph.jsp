<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公司关系图</title>
<script src="${pageContext.request.contextPath}/js/echarts.js" type="text/javascript" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/esl.source.js" type="text/javascript" charset="utf-8"></script>

</head>
<body>

	<!-- 为 ECharts 准备一个具备大小（宽高）的Dom -->
	<div id="main" style="width: 1000px; height: 800px;"></div>
	<script type="text/javascript">
		// 基于准备好的dom，初始化echarts实例
		var myChart = echarts.init(document.getElementById('main'));
		var note = []; //类别数组（用于存放饼图的类别）
		var links2 = [];
		// 指定图表的配置项和数据
		option = {
			
			title : {
				text : '公司关系图表'
			},
			tooltip : {},
			animationDurationUpdate : 1500,
			animationEasingUpdate : 'quinticInOut',
			label : {
				normal : {
					show : true,
					textStyle : {
						fontSize : 12
					},
				}
			},
			legend : {
				show: true,
		        x: "center",
		        data: ["公司", "股东", "高管", "分公司/分支机构"]
			},
			series : [

			{
				type : 'graph',
				layout : 'force',
				symbolSize : 45,
				focusNodeAdjacency : true,
				roam: true,
				draggable : true,
				categories : [ {
					name : '公司',
					itemStyle : {
						normal : {
							color : "#009800",
						}
					}
				}, {
					name : '股东',
					itemStyle : {
						normal : {
							color : "#4592FF",
						}
					}
				}, {
					name : '高管',
					itemStyle : {
						normal : {
							color : "#3592F",
						}
					}
				} ],
				label : {
					normal : {
						show : true,
						textStyle : {
							fontSize : 12
						},
					}
				},
				force : {
					repulsion : 1000
				},
				edgeSymbolSize : [ 4, 50 ],
				edgeLabel : {
					normal : {
						show : true,
						textStyle : {
							fontSize : 10
						},
						formatter : "{c}"
					}
				},
				data : note,
				links : links2,
				lineStyle : {
					normal : {
						opacity : 0.9,
						width : 1,
						curveness : 0
					}
				},
				categories : [ {
					name : '公司'
				}, {
					name : '股东'
				}, {
					name : '高管'
				}, {
					name : '分公司/分支机构'
				} ]
			} ]
		};
		
		myChart.showLoading();	
		$.ajax({
			url : '${pageContext.request.contextPath }/echar.action',
			type : 'get',
			dataType: "json",
			data : {"uuid":'${param.uuid}'},  
			success : function(data) {
				
				var result = data;
				$.each(result.echartsData.nodes, function(index, item) {
					note.push({
						name : item.name,
						category : item.category,
						id : item.id
					});

				});

				$.each(result.echartsData.links, function(index, item) {
					links2.push({
						value : item.name,
						source : item.source,
						target : item.target

					});

				});
				myChart.hideLoading();	  //隐藏加载动画
				myChart.setOption(option);

			},
			error : function(errorMsg) {

				alert("不好意思，大爷，图表请求数据失败啦!");

			}
		});
		
	
		
	</script>
</body>
</html>