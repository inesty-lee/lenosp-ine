package com.len.pdms.service.provider.mapper;


import com.len.base.BaseMapper;
import com.len.pdms.model.entity.Tenant;
import org.springframework.stereotype.Repository;


//自动帮Tenant编写增删改查
@Repository
public interface TenantMapper extends BaseMapper<Tenant,String> {
}
