package com.len.pdms.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Table(name = "pdms_tenant")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tenant {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "tenant_name")
    private String tenantName;
    @Column(name = "create_date")
    private Date createDate;
}
