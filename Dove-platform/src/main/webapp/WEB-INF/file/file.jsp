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
    <title>File Info</title>
    <meta charset="utf-8" />
    <title>Simple example - Editor.md examples</title>
    <link rel="stylesheet" href="/resources/Dove/css/style.css" />
    <link rel="stylesheet" href="/resources/Dove/css/editormd.preview.min.css" />
    <link rel="stylesheet" href="/resources/Dove/css/editormd.css" />
    <link rel="shortcut icon" href="https://pandao.github.io/editor.md/favicon.ico" type="image/x-icon" />
    <script src="/resources/Dove/js/jquery.min.js"></script>
    <script src="/resources/Dove/lib/marked.min.js"></script>
    <script src="/resources/Dove/lib/prettify.min.js"></script>
    <script src="/resources/Dove/editormd.min.js"></script>
</head>
<body>
<div id="layout">
    <div id="doc-content">
    <textarea style="display:none;">
    ${file.fileContent}
    </textarea>
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
        });});
</script>
</body>
</html>
