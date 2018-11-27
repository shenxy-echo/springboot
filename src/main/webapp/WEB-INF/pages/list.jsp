<%--
  User: shen_
  Date: 2018/9/11
  Time: 20:06
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>列表</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap-multiselect.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/multiselect.min.js" ></script>
    <style type="text/css">
        th{
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container" style=" position: absolute;  top: 10px; left: 20%; ">
<table class="table table-hover table-bordered table-striped"  style="width: 60%;text-align: center"<%--width="60%" cellpadding="10px" cellspacing="0" align="center" border="1px"--%>>
    <tr class="info" >
        <th>序号</th>
        <th>姓名</th>
        <th>昵称</th>
        <th>密码</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
    <c:choose>
        <c:when test="${users!=null}">
            <c:forEach items="${users}" var="user" varStatus="vs">
                <tr >
                    <td>${vs.count}</td>
                    <td>${user.name}</td>
                    <td>${user.nickName}</td>
                    <td>${user.password}</td>
                    <td>${user.age}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/update?id="+${user.id}>修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="${pageContext.request.contextPath}/delete?id="+${user.id}>删除</a>
                    </td>
                </tr>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <tr>
                <td colspan="5">无数据</td>
            </tr>
        </c:otherwise>
    </c:choose>
</table>
</div>
</body>
</html>
