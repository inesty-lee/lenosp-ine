package com.len.pdms.test;

import com.len.pdms.servcie.api.TenantService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class Test1 {


    @Autowired
    TenantService tenantService;
    @Test
    public void test() {
        System.out.println(tenantService);
    }
}
