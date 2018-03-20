<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2018/3/2
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page  isELIgnored="false"%>
<html>
<head>
    <title>File Scan</title>
    <script type="text/javascript" src="/resources/js/jquery.pjax.js"></script>
</head>
<body>
<div class="NULL">**************************************************************************************</div>
<div class="pjax_loading"></div>
<div class="ShowDir"></div>
<c:forEach var="file" items="${files.directaryNames}">
    <p>文件夹:<a href="${file.value}${file.key}/"> ${file.key}</a></p>
</c:forEach>

<c:forEach var="file" items="${files.fileNames}">
    <p>文件:<a href="${file.value}${file.key}"> ${file.key}</a></p>
</c:forEach>

<script>
    $(document).pjax('a[target!=_blank]', '#contentleft', {fragment:'#ShowDir', timeout:8000});
    $(document).on('pjax:send', function() { //pjax链接点击后显示加载动画；
        $(".pjax_loading").css("display", "block");
    });
    $(document).on('pjax:complete', function() { //pjax链接加载完成后隐藏加载动画；
        $(".pjax_loading").css("display", "none");
        pajx_loadDuodsuo();
    });
    function pajx_loadDuodsuo(){
        var dus=$(".ds-thread");
        if($(dus).length==1){
            var el = document.createElement('div');
            el.setAttribute('data-thread-key',$(dus).attr("data-thread-key"));//必选参数
            el.setAttribute('data-url',$(dus).attr("data-url"));
            DUOSHUO.EmbedThread(el);
            $(dus).html(el);
        }
    }
</script>
</body>
</html>
