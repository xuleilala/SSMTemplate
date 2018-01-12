<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <script type="text/javascript" src="../static/js/jquery.min.js"></script>
    <!--  Bootstrap-->
    <link rel="stylesheet" href="../static/css/bootstrap.min.css">
    <script src="../static/js/bootstrap.min.js"></script>
    <!-- 自定义分页的JS插件 -->
    <script type="text/javascript" src="../static/js/pagination.js"></script>
</head>
<body>
<h2>Hello World!</h2>
    <form class="form-horizontal" role="form">
        <div class="form-group">
            <label for="keyWordInput" class="col-sm-2 control-label">关键字</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" id="keyWordInput" placeholder="请输入关键词" value="${keyWord}">
            </div>
            <span class="col-sm-2">
                <button type="button" class="btn btn-success" id="searchBtn">搜索</button>
            </span>
        </div>
    </form>

    <form action="${pageContext.request.contextPath}/Course/list" method="POST" name="spForm" id="spForm">
        <input type="hidden" id="currentPage" name="currentPage" value="${pageInfo.pageNum}">
        <input type="hidden" id="lineSize" name="lineSize" value="${pageInfo.pageSize}">
        <input type="hidden" id="keyWord" name="keyWord" value="${keyWord}">
        <button type="button" class="btn btn-primary" value="${pageInfo.firstPage}"
            ${pageInfo.pageNum==1?"disabled='disabled'":""}>
                首页
        </button>
        <button type="button" class="btn btn-success"
                value="${pageInfo.prePage}"
            ${pageInfo.prePage==0?"disabled='disabled'":""}>
                上一页
        </button>
        &nbsp;&nbsp;&nbsp;跳转到第&nbsp;
        <div class="btn-group">
            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" id="cpBtn">
                ${pageInfo.pageNum}&nbsp;&nbsp;<span class="caret"></span>
            </button>
            <ul class="dropdown-menu" role="menu" id="cpMenu">
                <c:forEach begin="1" end="${pageInfo.pages}" var="page">
                    <li><a href="#">${page}</a></li>
                </c:forEach>
            </ul>
        </div>&nbsp;页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;每页显示&nbsp;
        <div class="btn-group">
            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" id="lsBtn">
                ${pageInfo.pageSize}&nbsp;&nbsp;<span class="caret"></span>
            </button>
            <ul class="dropdown-menu" role="menu" id="lsMenu">
                <c:forEach items="${lineSizes}" var="lineSize">
                    <li><a href="#">${lineSize}</a></li>
                </c:forEach>
            </ul>
        </div>&nbsp;条&nbsp;&nbsp;&nbsp;
        <button type="button" class="btn btn-info"
                value="${pageInfo.nextPage}"
            ${pageInfo.nextPage==0?"disabled='disabled'":""}>
                下一页
        </button>
        <button type="button" class="btn btn-danger"value="${pageInfo.lastPage}"
            ${pageInfo.pageNum==pageInfo.lastPage?"disabled='disabled'":""}>
                尾页
        </button>
        &nbsp;共 &nbsp;${pageInfo.size}/${pageInfo.total} &nbsp;条
    </form>
</body>
</html>
