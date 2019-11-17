package com.len.pdms.model.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 *
 * 前端过来的东西封装成一个对象,但是又不是整个实体对象,因为用不到那么多字段
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TenantVo {

    private String id;//uuid

    private String tenantName;//租户公司的名字

    private Date createDate;//日期

    //租户公司负责人(管理员)的登录名和密码
    private String username;

    private String password;

}
