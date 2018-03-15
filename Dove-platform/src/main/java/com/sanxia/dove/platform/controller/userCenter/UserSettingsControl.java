/**
 * Project Name:Dove-platform
 * File Name:userSettingsControl.java
 * Package Name:com.sanxia.dove.platform.controller.userCenter
 * Date:2018年3月12日下午19:38
 *
 */

package com.sanxia.dove.platform.controller.userCenter;

import com.sanxia.dove.common.core.dto.MapDto;
import com.sanxia.dove.platform.core.controller.PlatformBaseController;
import com.sanxia.dove.platform.service.UserService;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户设置
 */

@Controller
@RequestMapping("/settings")
public class UserSettingsControl extends PlatformBaseController {

    @Autowired
    private UserService userService;

    /*
    * account page
    * */
    @RequestMapping("/account")
    public String toUserCenterAccountPage(){
        return "userCenter/account";
    }

    /**
     *  profile page
     * @return
     */
    @RequestMapping("/profile")
    public String toUserCenterProfilePage(){
        return "userCenter/profile";
    }

    @RequestMapping("/account/updatePwd")
    @ResponseBody
    public MapDto UpdatePwd(@RequestParam(value = "username")String username,
                            @RequestParam(value = "old_password", required = false ) String old_password,
                            @RequestParam(value="new_password", required = false )String new_password){

        return userService.updatePwd(username, old_password, new_password, getUser());
    }
}
