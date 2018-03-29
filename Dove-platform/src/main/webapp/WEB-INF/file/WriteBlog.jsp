<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2018/3/7
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/common/taglib.jsp" %>
<!doctype html>
<html lang="en">
<head>
    <title>写日志</title>
    <%@ include file="/WEB-INF/common/head.jsp"%>
    <%@ include file="/WEB-INF/file/common/head.jsp"%>
</head>

<body class="min-width-0">
    <%@ include file="/WEB-INF/common/top_logined.jsp"%>
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

    <%@ include file="/WEB-INF/common/footer.jsp"%>
    <%@ include file="/WEB-INF/common/script.jsp"%>
<script type="text/javascript">
    var testEditor;

    $(function () {
        testEditor = editormd("test-editormd", {
            width: "90%",
            height: 600,
            path: "/resources/vendors/md/lib/",
            imageUpload: true,
            imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
            imageUploadURL: "/Blog/doUploadImg",
            saveHTMLToTextarea: true
        })
    });

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
