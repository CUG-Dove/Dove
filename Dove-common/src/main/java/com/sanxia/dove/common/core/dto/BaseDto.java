/**
 * Project Name:Dove-common
 * File Name:BaseDto.java
 * package com.sanxia.dove.common.core.dto;
 * Date:2018年3月7日上午10:20:41
 *
 */
package com.sanxia.dove.common.core.dto;

import com.sanxia.dove.common.core.utils.DoveConstants;

import java.io.Serializable;

/**
 * Description:<br/>
 * Date:2018年3月7日 上午10:19
 * @author ly
 * @version
 * @see
 */
public class BaseDto implements Serializable{

    protected int status = DoveConstants.SUCCESS;  // 处理状态  默认成功  0成功，1失败,2token无效

    protected String msg = "";                      // 如果出错，将返回错误消息

    protected String code = "";                     // 在特定错误情况下，会返回错误的代码

    public void errorMsg(String msg ){
        this.status = DoveConstants.FAIL;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
