package com.len.pdms.servcie.api;


import com.len.base.BaseService;
import com.len.pdms.model.entity.Tenant;
import com.len.pdms.model.vo.TenantVo;
import org.springframework.stereotype.Service;

@Service
public interface TenantService extends BaseService<Tenant,String> {
    int addTenant(TenantVo tenantVo);
}
