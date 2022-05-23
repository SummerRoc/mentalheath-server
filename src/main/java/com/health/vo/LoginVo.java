package com.health.vo;

import lombok.Data;

/**
 * @author zhanggaoxiang
 * @ClassName LoginVo 登录模型类
 * @Description TODO
 * @Date 2021/1/15 16:38
 * @Version 1.0
 **/
@Data
public class LoginVo {
    private Integer uid;
    private String  password;
    private Integer role;
    private String image;
}
