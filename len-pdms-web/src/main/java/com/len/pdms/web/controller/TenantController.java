package com.len.pdms.web.controller;

import com.len.pdms.model.vo.TenantVo;
import com.len.pdms.servcie.api.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pdms/tenant")
public class TenantController {


    @Autowired
    TenantService tenantService;

    @RequestMapping("/register")
    public String toRegister() {
        return "pdms/tenant-register";
    }
    @RequestMapping("/addTenant")
    public String addTenant(TenantVo tenantVo) {

        tenantService.addTenant(tenantVo);

        return "pdms/tenant-register-success";
    }

}
