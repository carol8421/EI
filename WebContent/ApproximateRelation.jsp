<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公司关系图</title>
<script src="${pageContext.request.contextPath}/js/echarts.js"
	type="text/javascript" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/esl.source.js"
	type="text/javascript" charset="utf-8"></script>

</head>
<body>

	<!-- 为 ECharts 准备一个具备大小（宽高）的Dom -->
	<div id="main" style="width: 1000px; height: 800px;"></div>
	<script type="text/javascript">
		// 基于准备好的dom，初始化echarts实例
		var myChart = echarts.init(document.getElementById('main'));
		
		// 指定图表的配置项和数据
		option = {

    title: {
        text: '疑似关系'
    },
    tooltip: {},
    animationDurationUpdate: 1500,
    animationEasingUpdate: 'quinticInOut',
    label: {
        normal: {
            show: true,
            textStyle: {
                fontSize: 12
            },
        }
    },
    legend: {
        show: true,
        x: "center",
        data: ["公司", "股东", "高管"]
    },
    series: [

        {
            type: 'graph',
            layout: 'force',
            symbolSize: 45,
            focusNodeAdjacency: true,
            roam: true,
            draggable: true,
            categories: [{
                name: '公司',
                itemStyle: {
                    normal: {
                        color: "#009800",
                    }
                }
            }, {
                name: '股东',
                itemStyle: {
                    normal: {
                        color: "#4592FF",
                    }
                }
            }, {
                name: '高管',
                itemStyle: {
                    normal: {
                        color: "#3592F",
                    }
                }
            }],
            label: {
                normal: {
                    show: true,
                    textStyle: {
                        fontSize: 12
                    },
                }
            },
            force: {
                repulsion: 1000
            },
            edgeSymbolSize: [4, 50],
            edgeLabel: {
                normal: {
                    show: true,
                    textStyle: {
                        fontSize: 10
                    },
                    formatter: "{c}"
                }
            },
            data: [{
                name: "邱宗玉",
                category: 1,
                symbolSize: 100,
                draggable: true,
                itemStyle: {
                    normal: {
                        borderColor: '#04f2a7',
                        borderWidth: 6,
                        shadowBlur: 20,
                        shadowColor: '#04f2a7',

                    }
                }
            }, {
                name: "中国林业科学研究院林产化学工业设计所",
                category: 0,
                symbolSize: 100,
                draggable: true,
                itemStyle: {
                    normal: {
                        borderColor: '#04f2a7',
                        borderWidth: 6,
                        shadowBlur: 20,
                        shadowColor: '#04f2a7',

                    }
                }

            }, {
                name: "南京邮电学院后勤汽车修理厂",
                category: 0

            }, {
                name: "中国煤炭物资徐州公司",
                category: 0

            }, {
                name: "谢公社",
                category: 1

            }, {
                name: "王尔康",
                category: 1

            }, {
                name: "钱军",
                category: 1

            }, {
                name: "姜宗祥",
                category: 2

            }, {
                name: "吴家驹",
                category: 2

            }],
            links: [{
                source: '邱宗玉',
                target: '南京邮电学院后勤汽车修理厂',
                value: '股东',

            }, {
                source: '邱宗玉',
                target: '中国煤炭物资徐州公司',
                value: '股东'

            }, {
                source: '王尔康',
                target: '中国煤炭物资徐州公司',
                value: '股东',

            }, {
                source: '中国林业科学研究院林产化学工业设计所',
                target: '谢公社',
                value: '股东',

            }, {
                source: '中国林业科学研究院林产化学工业设计所',
                target: '钱军',
                value: '股东',

            }, {
                source: '王尔康',
                target: '中国林业科学研究院林产化学工业设计所',
                value: '股东',

            }, {
                source: '姜宗祥',
                target: '南京邮电学院后勤汽车修理厂',
                value: '高管',

            }, {
                source: '吴家驹',
                target: '中国煤炭物资徐州公司',
                value: '高管',

            }],
            lineStyle: {
                normal: {
                    opacity: 0.9,
                    width: 1,
                    curveness: 0
                }
            },
            categories: [{
                name: '公司'
            }, {
                name: '股东'
            }, {
                name: '高管'
            }]
        }
    ]
};
		
		myChart.showLoading();	
		$.ajax({
			url : '${pageContext.request.contextPath }/echar.action',
			type : 'get',
			dataType: "json",
			data : {"uuid":'3292d6a15a8111e8bf911cb72c2a2f9a'},  
			success : function(data) {
				
				
				
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