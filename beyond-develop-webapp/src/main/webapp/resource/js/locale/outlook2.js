﻿$(function(){
	var _menus = {
			"menus" : [ {
				"menuid" : "1",
				"icon" : "icon-sys",
				"menuname" : "系统管理",
				"menus" : [ {
					"menuname" : "菜单管理",
					"icon" : "icon-nav",
					"url" : "tree.html"
				}, {
					"menuname" : "组织管理",
					"icon" : "icon-nav",
					"url" : "dept.html"
				}, {
					"menuname" : "添加用户",
					"icon" : "icon-add",
					"url" : "demo.html"
				}, {
					"menuname" : "treeGrid",
					"icon" : "icon-users",
					"url" : "treeGrid.html"
				}, {
					"menuname" : "角色管理",
					"icon" : "icon-role",
					"url" : "demo2.html"
				}, {
					"menuname" : "权限设置",
					"icon" : "icon-set",
					"url" : "demo.html"
				}, {
					"menuname" : "系统日志",
					"icon" : "icon-log",
					"url" : "demo.html"
				} ]
			}, {
				"menuid" : "8",
				"icon" : "icon-sys",
				"menuname" : "员工管理",
				"menus" : [ {
					"menuname" : "员工列表",
					"icon" : "icon-nav",
					"url" : "demo.html"
				}, {
					"menuname" : "视频监控",
					"icon" : "icon-nav",
					"url" : "demo1.html"
				} ]
			}, {
				"menuid" : "56",
				"icon" : "icon-sys",
				"menuname" : "部门管理",
				"menus" : [ {
					"menuname" : "添加部门",
					"icon" : "icon-nav",
					"url" : "demo1.html"
				}, {
					"menuname" : "部门列表",
					"icon" : "icon-nav",
					"url" : "demo2.html"
				} ]
			}, {
				"menuid" : "28",
				"icon" : "icon-sys",
				"menuname" : "财务管理",
				"menus" : [ {
					"menuname" : "收支分类",
					"icon" : "icon-nav",
					"url" : "demo.html"
				}, {
					"menuname" : "报表统计",
					"icon" : "icon-nav",
					"url" : "demo1.html"
				}, {
					"menuname" : "添加支出",
					"icon" : "icon-nav",
					"url" : "demo.html"
				} ]
			}, {
				"menuid" : "39",
				"icon" : "icon-sys",
				"menuname" : "商城管理",
				"menus" : [ {
					"menuname" : "商品分",
					"icon" : "icon-nav",
					"url" : "/shop/productcatagory.aspx"
				}, {
					"menuname" : "商品列表",
					"icon" : "icon-nav",
					"url" : "/shop/product.aspx"
				}, {
					"menuname" : "商品订单",
					"icon" : "icon-nav",
					"url" : "/shop/orders.aspx"
				} ]
			} ]
		};
	generateMenuTree(_menus);
	tabClose();
	tabCloseEven();
})

//初始化左侧
function InitLeftMenu() {
    $(".easyui-accordion").empty();
    $.ajax({
    	type:'POST',
    	url:basepath+'/menu/index',
    	data:{},
    	dataType:'json',
    	success:function(data){
    		if(data.success){
    			generateMenuTree(data.result);
    		}else{
    			alert(data.msg);
    		}
    	}
    });
}



function generateMenuTree(data){
	$.each(data, function (i, item) {
        var groupInfo = item;
        var strMenuItemHTML = "";
        $.each(item.menus, function (j, menu) {
            strMenuItemHTML += '<div style="height:22px;padding-top:10px;font-size:10pt;"><a onclick="addTAB(this)" href="#" src="'+menu.url+'" iconcls="'+menu.icon+'">' + menu.menuname + '</a></div>';
        });
        $("#treeAccordion").accordion('add', {
            title: groupInfo.menuname,
            content: strMenuItemHTML,
            selected: false
        });
    });
}

function addTAB(obj){
	var subtitle = obj.text;
	var url = obj.getAttribute('src');
	if(!$('#tabs').tabs('exists',subtitle)){
		$('#tabs').tabs('add',{
			title:subtitle,
			content:createFrame(url,subtitle),
			closable:true,
			tools:[{
				iconCls:'icon-reload',
				handler:function(){
					tabRefresh();
				}
		    }],
			width:$('#mainPanle').width()-10,
			height:$('#mainPanle').height()-26
		});
	}else{
		$('#tabs').tabs('select',subtitle);
	}
	tabClose();
}

function addTab(subtitle,url){
	if(!$('#tabs').tabs('exists',subtitle)){
		$('#tabs').tabs('add',{
			title:subtitle,
			content:createFrame(url,subtitle),
			closable:true,
			width:$('#mainPanle').width()-10,
			height:$('#mainPanle').height()-26
		});
	}else{
		$('#tabs').tabs('select',subtitle);
	}
	tabClose();
}

function colseTab(subtitle){
	if($('#tabs').tabs('exists',subtitle)){
		$('#tabs').tabs('close',subtitle);
	}
}

function createFrame(url,title)
{
	var s = '<iframe allowfullscreen mozallowfullscreen webkitallowfullscreen  name="mainFrame" scrolling="auto" frameborder="0" title='+ title+' src="'+url+'" style="width:100%;height:100%;"></iframe>';
	return s;
}

function tabClose()
{
	/*双击关闭TAB选项卡*/
	$(".tabs-inner").dblclick(function(){
		var subtitle = $(this).children("span").text();
		$('#tabs').tabs('close',subtitle);
	})

	$(".tabs-inner").bind('contextmenu',function(e){
		$('#mm').menu('show', {
			left: e.pageX,
			top: e.pageY,
		});
		
		var subtitle =$(this).children("span").text();
		$('#mm').data("currtab",subtitle);
		
		return false;
	});
}
//选中制定的tab页
function selectPanel(){
    var tab = $('#tabs').tabs('getSelected');
    if(tab){
        var index = $('#tabs').tabs('getTabIndex',tab);
        $('#tabs').tabs('selected',index);
    }
}

function tabRefresh(){
	var tab = $('#tabs').tabs('getSelected');
	var url = $("iframe",tab).attr('src');
	$('#tabs').tabs('update',{
		tab:tab,
		options:{content : createFrame(url),
				closable:true,
				selected:true}
	});
}


//绑定右键菜单事件
function tabCloseEven()
{
	//刷新当前tab页
	$('#mm-tabrefresh').click(function(){
		tabRefresh();		
	})
	//关闭当前
	$('#mm-tabclose').click(function(){
		var currtab_title = $('#mm').data("currtab");
		$('#tabs').tabs('close',currtab_title);
	})
	//全部关闭
	$('#mm-tabcloseall').click(function(){
		$('.tabs-inner span').each(function(i,n){
			var t = $(n).text();
			$('#tabs').tabs('close',t);
		});	
	});
	//关闭除当前之外的TAB
	$('#mm-tabcloseother').click(function(){
		var currtab_title = $('#mm').data("currtab");
		$('.tabs-inner span').each(function(i,n){
			var t = $(n).text();
			if(t!=currtab_title)
				$('#tabs').tabs('close',t);
		});	
	});
	//关闭当前右侧的TAB
	$('#mm-tabcloseright').click(function(){
		var nextall = $('.tabs-selected').nextAll();
		if(nextall.length==0){
			//msgShow('系统提示','后边没有啦~~','error');
			console.log('后边没有啦~~');
			return false;
		}
		nextall.each(function(i,n){
			var t=$('a:eq(0) span',$(n)).text();
			$('#tabs').tabs('close',t);
		});
		return false;
	});
	//关闭当前左侧的TAB
	$('#mm-tabcloseleft').click(function(){
		var prevall = $('.tabs-selected').prevAll();
		if(prevall.length==0){
			console.log('到头了，前边没有啦~~');
			return false;
		}
		prevall.each(function(i,n){
			var t=$('a:eq(0) span',$(n)).text();
			$('#tabs').tabs('close',t);
		});
		return false;
	});

	//退出
	$("#mm-exit").click(function(){
		$('#mm').menu('hide');
	})
}

//弹出信息窗口 title:标题 msgString:提示信息 msgType:信息类型 [error,info,question,warning]
function msgShow(title, msgString, msgType) {
	$.messager.alert(title, msgString, msgType);
}

function clockon() {
    var now = new Date();
    var year = now.getFullYear(); //getFullYear getYear
    var month = now.getMonth();
    var date = now.getDate();
    var day = now.getDay();
    var hour = now.getHours();
    var minu = now.getMinutes();
    var sec = now.getSeconds();
    var week;
    month = month + 1;
    if (month < 10) month = "0" + month;
    if (date < 10) date = "0" + date;
    if (hour < 10) hour = "0" + hour;
    if (minu < 10) minu = "0" + minu;
    if (sec < 10) sec = "0" + sec;
    var arr_week = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");
    week = arr_week[day];
    var time = "";
    time = year + "年" + month + "月" + date + "日" + " " + hour + ":" + minu + ":" + sec + " " + week;

    $("#bgclock").html(time);

    var timer = setTimeout("clockon()", 200);
}
