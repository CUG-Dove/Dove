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
    <%@ include file="common/head.jsp" %>
    <%@ include file="/WEB-INF/common/head.jsp" %>
</head>
<body>
<%@ include file="/WEB-INF/common/top_logined.jsp"%>
<div id="layout">
    <c:choose>
    <c:when test="${file.fileType=='java'}">
    <div id="doc-content">

        <pre>
          <code class="hljs haskell">$('a[<span class="hljs-class"><span class="hljs-keyword"><span class="hljs-class"><span class="hljs-keyword">data</span></span></span><span class="hljs-class">-pjax]').pjax()</span></span></code>
            **************************
<code class="hljs javascript">$.fn.pjax = <span class="hljs-function"><span class="hljs-keyword"><span class="hljs-function"><span class="hljs-keyword">function</span></span></span><span class="hljs-function">(</span><span class="hljs-params"><span class="hljs-function"><span class="hljs-params"> container, options </span></span></span><span class="hljs-function">) </span></span>{
  <span class="hljs-keyword">return</span> <span class="hljs-keyword">this</span>.live(<span class="hljs-string">'click.pjax'</span>, <span class="hljs-function"><span class="hljs-keyword"><span class="hljs-function"><span class="hljs-keyword">function</span></span></span><span class="hljs-function">(</span><span class="hljs-params"><span class="hljs-function"><span class="hljs-params">event</span></span></span><span class="hljs-function">)</span></span>{
    handleClick(event, container, options)
  })
}

<span class="hljs-function"><span class="hljs-keyword"><span class="hljs-function"><span class="hljs-keyword">function</span></span></span><span class="hljs-function"> </span><span class="hljs-title"><span class="hljs-function"><span class="hljs-title">handleClick</span></span></span><span class="hljs-function">(</span><span class="hljs-params"><span class="hljs-function"><span class="hljs-params">event, container, options</span></span></span><span class="hljs-function">) </span></span>{
  $.pjax($.extend({}, defaults, options))
  ...
  event.preventDefault()
}
<span class="hljs-keyword">var</span> pjax = $.pjax = <span class="hljs-function"><span class="hljs-keyword"><span class="hljs-function"><span class="hljs-keyword">function</span></span></span><span class="hljs-function">(</span><span class="hljs-params"><span class="hljs-function"><span class="hljs-params"> options </span></span></span><span class="hljs-function">) </span></span>{
  ...
  pjax.xhr = $.ajax(options)
}</code>
            *************************
            <code class="hljs less">xhr<span class="hljs-selector-class">.setRequestHeader</span>(<span class="hljs-string">'X-PJAX'</span>, <span class="hljs-string">'true'</span>)
<span class="hljs-selector-tag">xhr</span><span class="hljs-selector-class">.setRequestHeader</span>(<span class="hljs-string">'X-PJAX-Container'</span>, context.selector)</code>
            **************************
            <code class="hljs php">options.success = <span class="hljs-function"><span class="hljs-keyword"><span class="hljs-function"><span class="hljs-keyword">function</span></span></span><span class="hljs-params"><span class="hljs-function"><span class="hljs-params">(data, status, xhr)</span></span></span><span class="hljs-function"> </span></span>{
  <span class="hljs-keyword">var</span> container = extractContainer(data, xhr, options)
  ...
  <span class="hljs-keyword">if</span> (container.title) document.title = container.title
  context.html(container.contents)
}</code>
            ********************
            <code class="hljs gradle">pjax.state = {
  id: <span class="hljs-keyword">options</span>.id || uniqueId(),
  url: container.url,
  container: context.selector,
  fragment: <span class="hljs-keyword">options</span>.fragment,
  timeout: <span class="hljs-keyword">options</span>.timeout
}

<span class="hljs-keyword">if</span> (<span class="hljs-keyword">options</span>.<span class="hljs-keyword">push</span> || <span class="hljs-keyword">options</span>.replace) {
  window.history.replaceState(pjax.state, container.title, container.url)
}</code>
            *********************************
            <code class="hljs javascript">$(<span class="hljs-built_in">window</span>).bind(<span class="hljs-string">'popstate'</span>, <span class="hljs-function"><span class="hljs-keyword"><span class="hljs-function"><span class="hljs-keyword">function</span></span></span><span class="hljs-function">(</span><span class="hljs-params"><span class="hljs-function"><span class="hljs-params">event</span></span></span><span class="hljs-function">)</span></span>{
  <span class="hljs-keyword">var</span> state = event.state
  <span class="hljs-keyword">if</span> (state && state.container) {
    <span class="hljs-keyword">var</span> container = $(state.container)
    <span class="hljs-keyword">if</span> (container.length) {
      ...
      var options = {
        id: state.id,
        url: state.url,
        container: container,
        push: <span class="hljs-literal">false</span>,
        fragment: state.fragment,
        timeout: state.timeout,
        scrollTo: <span class="hljs-literal">false</span>
      }

      <span class="hljs-keyword">if</span> (contents) {
        <span class="hljs-comment">// pjax event is deprecated</span>
        $(<span class="hljs-built_in">document</span>).trigger(<span class="hljs-string">'pjax'</span>, [<span class="hljs-literal">null</span>, options])
        container.trigger(<span class="hljs-string">'pjax:start'</span>, [<span class="hljs-literal">null</span>, options])
        <span class="hljs-comment">// end.pjax event is deprecated</span>
        container.trigger(<span class="hljs-string">'start.pjax'</span>, [<span class="hljs-literal">null</span>, options])

        container.html(contents)
        pjax.state = state

        container.trigger(<span class="hljs-string">'pjax:end'</span>, [<span class="hljs-literal">null</span>, options])
        <span class="hljs-comment">// end.pjax event is deprecated</span>
        container.trigger(<span class="hljs-string">'end.pjax'</span>, [<span class="hljs-literal">null</span>, options])
      } <span class="hljs-keyword">else</span> {
        $.pjax(options)
      }
      ...
    }
  }
}</code>
            ***********************
            <code class="hljs javascript"><span class="hljs-comment">// Is pjax supported by this browser?</span>
$.support.pjax =
  <span class="hljs-built_in">window</span>.history && <span class="hljs-built_in">window</span>.history.pushState && <span class="hljs-built_in">window</span>.history.replaceState
  <span class="hljs-comment">// pushState isn't reliable on iOS until 5.</span>
  && !navigator.userAgent.match(<span class="hljs-regexp">/((iPod|iPhone|iPad).+\bOS\s+[1-4]|WebApps\/.+CFNetwork)/</span>)</code>
            **************************
            <code class="hljs actionscript">options.beforeSend = <span class="hljs-function"><span class="hljs-keyword"><span class="hljs-function"><span class="hljs-keyword">function</span></span></span><span class="hljs-params"><span class="hljs-function"><span class="hljs-params">(xhr, settings)</span></span></span><span class="hljs-function"> </span></span>{
  <span class="hljs-keyword">if</span> (settings.timeout > <span class="hljs-number">0</span>) {
    timeoutTimer = setTimeout(<span class="hljs-function"><span class="hljs-keyword"><span class="hljs-function"><span class="hljs-keyword">function</span></span></span><span class="hljs-params"><span class="hljs-function"><span class="hljs-params">()</span></span></span><span class="hljs-function"> </span></span>{
      <span class="hljs-keyword">if</span> (fire(<span class="hljs-string">'pjax:timeout'</span>, [xhr, options]))
        xhr.abort(<span class="hljs-string">'timeout'</span>)
    }, settings.timeout)

    <span class="hljs-comment">// Clear timeout setting so jquerys internal timeout isn't invoked</span>
    settings.timeout = <span class="hljs-number">0</span></code>
        </pre>
    </div>
    </c:when>
    <c:when test="${file.fileType=='pic'}">
        <p><img src="${file.fileContent}"/></p>
    </c:when>
    </c:choose>
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
