<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<script type="text/javascript" src="js/jquery-1.8.2.js">
</script>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'list.jsp' starting page</title>
      <link rel="stylesheet" href="static/js/index2.css" type="text/css"></link>
      <script type="text/javascript" src="/static/js/jquery-1.8.2.js"></script>
  </head>
  <script type="text/javascript">
         function getPage(page){
             var product=$("#product").val();
             var bianhao=$("#bianhao").val();
             location.href="elevzhuisu?page="+page+"&product="+product+"&bianhao="+bianhao
         }
         function mohu(){
             //../../
        	 var product=$("#product").val();
             var bianhao=$("#bianhao").val();
        	 location.href="elevzhuisu?product="+product+"&bianhao="+bianhao;
         }
  </script>
  <body>
      <table>
          <a href="/export">导出表格</a><br>
          <form action="/importExcel2" method="post" enctype="multipart/form-data">
               <input name="file" type="file">
               <input type="submit" value="导入表格">
          </form>
          <tr>
              <td colspan="20">
                  <input type="text" id="product" value="${product}"  placeholder="请输入生产单位编号">
                  <input type="text" id="bianhao" value="${bianhao}"  placeholder="请输入生产许可证">
                  <input type="button"  value="追溯" onclick="mohu()">
              </td>
          </tr>

          <tr>
              <td>ID</td>
              <td>电梯生产单位</td>
              <td>电梯生产单位名称</td>
              <td>电梯生产许可证编号</td>
              <td>电梯生产单位地址</td>
              <td>联系电话</td>
              <td>负责人电话</td>
              <td>负责人姓名</td>
              <td>上月出厂数量</td>
              <td>本月出厂数量</td>
          </tr>
          <c:forEach items="${elist}" var="li">
              <tr>
                  <td>${li.id}</td>
                  <td>${li.productionunit_id}</td>
                  <td>${li.productionunit_name}</td>
                  <td>${li.productionunit_permit}</td>
                  <td>${li.productionunit_address}</td>
                  <td>${li.contact}</td>
                  <td>${li.duty}</td>
                  <td>${li.duty_name}</td>
                  <td>${li.factory_upper}</td>
                  <td>${li.factory}</td>
              </tr>
          </c:forEach>
          <tr>
              <td colspan="20">
                  <button onclick="getPage(1)">首页</button>
                  <button onclick="getPage(${pageUtil.prevPage})">上一页</button>
                  <button onclick="getPage(${pageUtil.nextPage})">下一页</button>
                  <button onclick="getPage(${pageUtil.totalPage})">尾页</button>
              </td>
          </tr>
          <a href="/pingjie">字符串</a>
      </table>
  </body>
</html>
