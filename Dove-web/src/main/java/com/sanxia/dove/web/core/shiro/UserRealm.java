package com.sanxia.dove.web.core.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import java.util.HashSet;
import java.util.Set;

public class UserRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        // String username = principals.getPrimaryPrincipal().toString();
        // 角色名的集合
        Set<String> roles = new HashSet<String>();
        // roles.addAll(userService.findMyRolesByUserName(username));
        // 权限名的集合
        Set<String> permissions = new HashSet<String>();
        // permissions.addAll(userService.findMyAuthsByUserName(username));
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.addRoles(roles);
        authorizationInfo.addStringPermissions(permissions);
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        // UsernamePasswordToken token = (UsernamePasswordToken) authToken;
        // String username = token.getUsername();
        // String password = new String(token.getPassword());
        // User user = userService.login(username, password);
        // if (user == null) {
        // throw new AuthenticationException("用户名或密码错误");
        // } else {
        // Subject currentUser = SecurityUtils.getSubject();
        // currentUser.getSession().setAttribute(WebBaseController.SESSION_USER,
        // user);
        AuthenticationInfo authcInfo = new SimpleAuthenticationInfo("", "", "databaseRealm");
        return authcInfo;
        // }
    }
}
