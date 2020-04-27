/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.moonshot.payroll.tenant.view;

import com.moonshot.payroll.DTO.TenantDTO;
import com.moonshot.payroll.service.MasterDataService;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author bhaduri
 */
@Named(value = "tenantList")
@ViewScoped
public class TenantList implements Serializable{
    private List<TenantDTO> tenantDTOList;
    /**
     * Creates a new instance of TenantList
     */
    public TenantList() {
    }
    
    public void fillTenantList() {
        MasterDataService mds = new MasterDataService();
        tenantDTOList = mds.getTenantList();
    }

    public List<TenantDTO> getTenantDTOList() {
        return tenantDTOList;
    }

    public void setTenantDTOList(List<TenantDTO> tenantDTOList) {
        this.tenantDTOList = tenantDTOList;
    }
    
    
}
