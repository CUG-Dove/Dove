<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2018/3/2
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/common/taglib.jsp" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>File Info</title>
    <meta charset="utf-8"/>
    <title>查看文件</title>
    <%@ include file="common/head.jsp" %>
</head>
<body>
<div id="layout">
    <div id="doc-content">
        <pre>
${file.fileContent}
        </pre>
    </div>
</div>

<script type="text/javascript">
    var testEditor;
    $(function () {
        testEditor = editormd.markdownToHTML("doc-content", {//注意：这里是上面DIV的id
            htmlDecode: "style,script,iframe",
            emoji: true,
            taskList: true,
            tex: true, // 默认不解析
            flowChart: true, // 默认不解析
            sequenceDiagram: true, // 默认不解析
            codeFold: true,
        });

    });
</script>
</body>
</html>
