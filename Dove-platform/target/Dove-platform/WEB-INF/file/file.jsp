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
    <link rel="stylesheet" href="/resources/vendors/markdown/css/style.css" />
    <link rel="stylesheet" href="/resources/vendors/markdown/css/editormd.preview.min.css" />
    <link rel="stylesheet" href="/resources/vendors/markdown/css/editormd.css" />
    <script src="/resources/vendors/jquery/dist/jquery.min.js"></script>
    <script src="/resources/vendors/markdown/marked.min.js"></script>
    <script src="/resources/vendors/markdown/prettify.min.js"></script>
    <script src="/resources/vendors/markdown/editormd.min.js"></script>
</head>
<body>
<div id="layout">
    <div id="doc-content">
        <textarea style="display:none;">
            <pre>
                ${file.fileContent}
            </pre>
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
