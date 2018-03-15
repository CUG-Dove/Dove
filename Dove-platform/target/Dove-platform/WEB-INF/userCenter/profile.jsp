<%--
  Created by IntelliJ IDEA.
  User: Dove
  Date: 2018/3/13
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/common/taglib.jsp"%>
<!doctype html>
<html lang="en">
<head>
    <%@ include file="/WEB-INF/common/head.jsp"%>
</head>
<body class="logged-out page-responsive min-width-0 f4">
<%@ include file="/WEB-INF/common/top_logined.jsp"%>
<div class="application-main" role="main">
    <div id="js-pjax-container" data-pjax-container>
        <div class="page-content container clearfix">

            <%@ include file="/WEB-INF/userCenter/menu.jsp"%>
            <div class="col-9 float-left">
                <div class="" style="border: 1px #e1e4e8 solid;padding: 20px;font-size: small" >
                    <div class="Subhead mt-0 mb-0" >
                        <h2 class="Subhead-heading" >我的资料</h2>
                    </div>
                    <form accept-charset="UTF-8" action="#" class="columns js-uploadable-container js-upload-avatar-image is-default" id="change_password" method="post">
                        <!--div style="margin:0;padding: 0;display: inline;">
                            <input type="text" name="" id="">
                        </div-->
                        <dl class="form-group ">
                            <dt>
                                <label for="user_full_name" style="display: block;margin-bottom: 7px;cursor: default;">昵称</label>
                            </dt>
                            <dd >
                                <input class="form-control" type="text" id=" user_full_name"  tabindex="2" name="user_full_name">
                            </dd>
                        </dl>
                        <dl class="form-group">
                            <dt>
                                <label for="user_profile_bio" >简介</label>
                            </dt>
                            <dd class="user-profile-bio-field-container">
                                <textarea class="form-control user-profile-bio-field" cols="40" rows="20" id="user_profile_bio"   name="user_profile_bio" placeholder="Tell us a little bit about yourself"></textarea>
                            </dd>
                            <p class="note">
                                你的<strong>简介信息</strong>将会被其他用户看到
                            </p>
                        </dl>
                        <dl class="form-group">
                            <dt>
                                <label for="user_profile_blog">URL</label>
                            </dt>
                            <dd >
                                <input class="form-control" type="url" id="user_profile_blog"  name="user_profile_blog" size="30">
                            </dd>
                            <p class="note">
                                 可以填写<strong> @博客、个人主页</strong> 等URL
                            </p>
                        </dl>
                        <dl class="form-group">
                            <dt>
                                <label for="user_profile_company">公司</label>
                            </dt>
                            <dd class="user-profile-company-field-container">
                                <input autocomplete="off" class="form-control" type="text" id="user_profile_company"  name="user_profile_company" size="30">
                            </dd>
                        </dl>
                        <hr></hr>
                        <dl class="form-group">
                            <dt>
                                <label for="user_profile_localtion">所在地</label>
                            </dt>
                            <dd>
                                <input class="form-control" id="" name="" size="30" type="text">
                            </dd>
                        </dl>
                        <p>
                            <button class="btn btn-success btn-block" style="width: 120px;" type="submit">更新用户信息</button>
                        </p>
                    </form>
                    <p class="note">
                        你的个人信息将会保存，我们将保证你的信息不会被泄漏。更多的请看我们的<a href="#">个人信息保护</a>条例。
                    </p>
            </div>
        </div>
    </div>
    <div class="" style="width: 290px;float: right !important;border: 1px #e1e4e8 solid;padding: 20px;font-size: small;margin-top: -520px;margin-right: 10px;">
        <div class="Subhead mt-0 mb-0" >
            <h2 class="Subhead-heading" >xxx</h2>
        </div>
    </div>
</div>




<%@ include file="/WEB-INF/common/script.jsp"%>
</body>

</html>
