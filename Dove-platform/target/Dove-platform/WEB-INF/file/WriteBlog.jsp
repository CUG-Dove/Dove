<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2018/3/7
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/common/taglib.jsp" %>
<html>
<head>
    <title>写日志</title>
    <%@ include file="common/head.jsp" %>
    <style type="text/css">

    </style>
</head>
<body>
<div id="layout">
    <header>
        <h1>Blog编辑器</h1>
    </header>
    <input type="submit" value="提交" onclick="submit_blog()"/>
    <div id="test-editormd">
        <textarea style="display:none;" class="editormd-html-textarea" id="editormd"></textarea>
        <textarea class="editormd-html-textarea" name="text" id="editormdhtml"></textarea>
        </textarea>
    </div>

</div>

<script type="text/javascript">
    var testEditor;

    $(function () {
        testEditor = editormd("test-editormd", {
            width: "90%",
            height: 600,
            syncScrolling: "single",
            path: "/resources/vendors/markdown/lib/",
            imageUpload: true,
            imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
            imageUploadURL: "/Blog/doUploadBlog",
            saveHTMLToTextarea: true
        })
    });

    /*
     // or
     testEditor = editormd({
     id      : "test-editormd",
     width   : "90%",
     height  : 640,
     path    : "../lib/"
     });
     */

    function submit_blog() {
        var htmlco = $("#editormdhtml").val();
        alert(htmlco);
        $.ajax(
            {
                data: {'html': htmlco},
                dataType: 'text',
                success: function (data) {
                    alert(data);
                },
                type: 'post',
                url: '/Blog/doUploadBlog'
            }
        );
    }


</script>
</body>
</html>
