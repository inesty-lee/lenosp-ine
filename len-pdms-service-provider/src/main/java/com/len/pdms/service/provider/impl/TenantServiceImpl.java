package com.len.pdms.service.provider.impl;

import cn.hutool.core.date.DateUtil;
import com.len.base.BaseMapper;
import com.len.base.impl.BaseServiceImpl;
import com.len.pdms.model.entity.Tenant;
import com.len.pdms.model.vo.TenantVo;
import com.len.pdms.servcie.api.TenantService;
import com.len.pdms.service.provider.mapper.TenantMapper;
import com.len.util.BeanUtil;
import com.len.util.IDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TenantServiceImpl extends BaseServiceImpl<Tenant,String> implements TenantService {


    @Autowired
    TenantMapper tenantMapper;
    @Override
    public BaseMapper getMappser() {
        return tenantMapper;
    }

    //提供服务:增加一个租户
    @Override
    public int addTenant(TenantVo tenantVo) {

        Tenant tenant = new Tenant();
        BeanUtil.copyNotNullBean(tenantVo,tenant);
        tenant.setCreateDate(DateUtil.date());
        tenant.setId(IDUtil.getID());

        this.insertSelective(tenant);

        return 1;
    }
}
