<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>欢迎</title>  
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
</head>  
<body>  
	
	<h2>PG包上行测试</h2>
	<div style="margin:20px 0;" align="left">
		<div class="easyui-panel" title="PG" style="width:800px">
			<div style="padding:10px 60px 20px 60px">
			    <form id="ff" method="post" action="">
			    	<table cellpadding="5">
			    		<tr>
			    			<td>header0</td>
			    			<td><input class="easyui-textbox" type="text" name="header0" data-options="required:true"></input></td>
			    			<td>header1</td>
			    			<td><input class="easyui-textbox" type="text" name="header1" data-options="required:true"></input></td>
			    			<td>imei</td>
			    			<td><input class="easyui-textbox" type="text" name="imei" data-options="required:true"></input></td>
			    		</tr>
			    		<tr>
			    			<td>lng</td>
			    			<td><input class="easyui-textbox" type="text" name="lng" data-options="required:true"></input></td>
			    			<td>lat</td>
			    			<td><input class="easyui-textbox" type="text" name="lat" data-options="required:true"></input></td>
			    			<td>hight</td>
			    			<td><input class="easyui-textbox" type="text" name="hight" data-options="required:true"></input></td>
			    		</tr>
			    		
			    		<tr>
			    			<td>speed</td>
			    			<td><input class="easyui-textbox" type="text" name="speed" data-options="required:true"></input></td>
			    			<td>status</td>
			    			<td><input class="easyui-textbox" type="text" name="status" data-options="required:true"></input></td>
			    			<td>star</td>
			    			<td><input class="easyui-textbox" type="text" name="star" data-options="required:true"></input></td>
			    		</tr>
			    		<tr>
			    			<td>Time</td>
			    			<td><input class="easyui-textbox" type="text" name="time" data-options="required:true"></td>
			    		</tr>
			    	</table>
			    </form>
			    <div style="text-align:center;padding:5px">
			    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
			    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>
			    </div>
		    </div>
		</div>
	</div>
	<script>
		function submitForm(){
// 			$('#ff').form('submit');
			$.ajax({
                cache: true,
                type: "POST",
                url:"${pageContext.request.contextPath}/pgData",
                data:$('#ff').serialize(),// 你的formid
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                	 alert("Connection"+data);
//                     $("#commonLayout_appcreshi").parent().html(data);
                }
            });
		}
		function clearForm(){
			$('#ff').form('clear');
		}
	</script>
</body>  
</html>  