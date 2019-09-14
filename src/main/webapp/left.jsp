<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'left.jsp' starting page</title>
    <script type="text/javascript" src="static/js/jquery-1.8.2.js"></script>
    <link rel="stylesheet" href="static/css/zTreeStyle/zTreeStyle.css" type="text/css"></link>
    <script type="text/javascript" src="static/js/jquery.ztree.core.js"></script>
  </head>
    <script type="text/javascript">
     $(function(){
    	 $.ajaxSetup({
    		 async:false
    	 })
    	 //
    	var setting={

          data: {
            simpleData: {
              enable:true,
              idKey: "id",//树节点ID名称
              pIdKey: "pId",//父节点ID名称
              rootPId: 0,//根节点ID
              rootId:0
            }
          }
    	}
    	//
    	var zNodes;//定义节点
    	var userid=${u.userid}//传入userid
    	$.post(
    		"/findPowerById",//根据用户id找对应权限
    		{userid:userid},
    		function(obj){
    		  //alert(JSON.stringify(obj))
    			zNodes=obj;
    		},"json"
    	
    	)
        $.fn.zTree.init($("#ztree"),setting,zNodes)
 
     })
  </script>

  <body>
     <ul id="ztree" class="ztree"></ul>
  </body>
</html>
