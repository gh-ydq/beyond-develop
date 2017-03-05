<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/css/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/css/themes/icon.css" />
	<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/css/demo.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/js/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/js/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/js/locale/outlook2.js"></script>
</head>
	<body  class="easyui-layout" style="overflow-y: hidden" scroll="no">
	
	<h2>Basic Tree</h2>
	<div region="west" split="true" title="导航菜单" style="width: 180px;"
		id="west">
		<div class="easyui-accordion" fit="true" border="false">
			<!--  导航内容 -->
			<div title="系统管理" data-options="iconCls:'icon-search'" style="overflow:auto;padding:10px;">
				<ul class="easyui-tree" >
					<li style="overflow:auto;padding:10px;"><a onclick="addTAB(this)" href="#" src="pgData.jsp" iconcls="icon-sys">PG数据包</a></li>
					<li style="overflow:auto;padding:10px;"><a onclick="addTAB(this)" href="#" src="plData.jsp" iconcls="icon-sys">PL数据包</a></li>
					<li style="overflow:auto;padding:10px;"><a onclick="addTAB(this)" href="#" src="phData.jsp" iconcls="icon-sys">PH数据包</a></li>
					<li style="overflow:auto;padding:10px;"><a onclick="addTAB(this)" href="#" src="cmdData.jsp" iconcls="icon-sys">CMD数据包</a></li>
				</ul>
			</div>
			
	   </div>
	</div> 
	<div id="mainPanle" region="center"
		style="background: #eee; overflow-y: hidden">
		<div id="tabs" class="easyui-tabs" fit="true" border="false">
			<div title="欢迎使用" style="padding: 20px; overflow: hidden;" id="home">
				<h1>Welcome to My Componay!</h1>
			</div>
		</div>
	</div>

</body>

</html>