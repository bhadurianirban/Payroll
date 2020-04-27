/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moonshot.payroll.service;

import com.moonshot.payroll.DAO.TenantDAO;
import com.moonshot.payroll.DTO.TenantDTO;
import com.moonshot.payroll.entities.Tenant;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author bhaduri
 */
public class MasterDataService {
    private EntityManagerFactory emf;

    public MasterDataService() {

        emf = Persistence.createEntityManagerFactory("com.moonshot_Payroll_war_1.0-SNAPSHOTPU");
    }
    
    public List<TenantDTO> getTenantList() {
        TenantDAO tenantDAO = new TenantDAO(emf);
        List<Tenant> tenantList = tenantDAO.findTenantEntities();
        List<TenantDTO> tenantDTOList = new ArrayList<>();
        for (Tenant tenant:tenantList) {
            TenantDTO tenantDTO = new TenantDTO(tenant.getId(), tenant.getName());
            tenantDTOList.add(tenantDTO);
        }
        return tenantDTOList;
    }
    
}
