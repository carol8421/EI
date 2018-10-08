<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无标题文档</title>
<script src="js/jquery.js"></script>
<script src="js/echarts.js"></script>
<script src="js/china.js"></script>
<style>
#china-map {
	width: 1000px;
	height: 1000px;
	margin: auto;
}
</style>
</head>
<body>
	<div id="china-map"></div>
	<script>
    var myChart = echarts.init(document.getElementById('china-map'));
    var option = {
        title : {
            text: '分公司地区分布图',
           
            x:'center'
        },
        tooltip : {//提示框组件。
            trigger: 'item'//数据项图形触发，主要在散点图，饼图等无类目轴的图表中使用。
        },
        legend: {
            orient: 'horizontal',//图例的排列方向
            x:'left',//图例的位置
            data:['分公司']
        },

        visualMap: {//颜色的设置  dataRange
            x: 'left',
            y: 'center',
            splitList: [
                {start: 100},
                {start: 40, end: 100},
                {start: 20, end: 40},
                {start: 11, end: 20},
                {start: 4, end: 10, },
                {start: 1, end: 3, },
                {end: 0}
            ],
//            min: 0,
//            max: 2500,
//            calculable : true,//颜色呈条状
            text:['高','低'],// 文本，默认为数值文本
            color: ['#E0022B', '#E09107', '#A3E00B']
        },
        toolbox: {//工具栏
            show: true,
            orient : 'vertical',//工具栏 icon 的布局朝向
            x: 'right',
            y: 'center',
            feature : {//各工具配置项。
                mark : {show: true},
                dataView : {show: true, readOnly: false},//数据视图工具，可以展现当前图表所用的数据，编辑后可以动态更新。
                restore : {show: true},//配置项还原。
                saveAsImage : {show: true}//保存为图片。
            }
        },
        roamController: {//控制地图的上下左右放大缩小 图上没有显示
            show: true,
            x: 'right',
            mapTypeControl: {
                'china': true
            }
        },
        series : [
            {
                name: '分公司数量',
                type: 'map',
                mapType: 'china',
                roam: false,//是否开启鼠标缩放和平移漫游
                itemStyle:{//地图区域的多边形 图形样式
                    normal:{//是图形在默认状态下的样式
                        label:{
                            show:true,//是否显示标签
                            textStyle: {
                                color: "rgb(249, 249, 249)"
                            }
                        }
                    },
                    emphasis:{//是图形在高亮状态下的样式,比如在鼠标悬浮或者图例联动高亮时
                        label:{show:true}
                    }
                },
                top:"3%",//组件距离容器的距离
                data:[
					{name: '北京',value: 0},
                    {name: '天津',value: 0},
                    {name: '上海',value: 0},
                    {name: '重庆',value: 0},
                    {name: '河北',value: 0},
                    {name: '河南',value: 0},
                    {name: '云南',value: 0},
                    {name: '辽宁',value: 0},
                    {name: '黑龙江',value: 0},
                    {name: '湖南',value: 0},
                    {name: '安徽',value: 0},
                    {name: '山东',value: 0},
                    {name: '新疆',value: 0},
                    {name: '江苏',value: 3},
                    {name: '浙江',value: 0},
                    {name: '江西',value: 0},
                    {name: '湖北',value: 0},
                    {name: '广西',value: 0},
                    {name: '甘肃',value: 0},
                    {name: '山西',value: 0},
                    {name: '内蒙古',value: 0},
                    {name: '陕西',value: 0},
                    {name: '吉林',value: 0},
                    {name: '福建',value: 0},
                    {name: '贵州',value: 0},
                    {name: '广东',value: 0},
                    {name: '青海',value: 0},
                    {name: '西藏',value: 0},
                    {name: '四川',value: 0},
                    {name: '宁夏',value: 0},
                    {name: '海南',value: 0},
                    {name: '台湾',value: 0},
                    {name: '香港',value: 0},
                    {name: '澳门',value: 0}
                ]
            }
        ]
    };
   
   
    
    myChart.showLoading();
	$.ajax({
		url : '${pageContext.request.contextPath }/map.action',
		type : 'get',
		dataType : "json",
		data : {
			"uuid" : '3292d6a15a8111e8bf911cb72c2a2f9a'
		},
		success : function(data) {

			
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