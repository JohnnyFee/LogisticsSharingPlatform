// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.lsp.model.transportation;

import com.lsp.model.transportation.CommodityProvider;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect CommodityProvider_Roo_Jpa_Entity {
    
    declare @type: CommodityProvider: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long CommodityProvider.id;
    
    @Version
    @Column(name = "version")
    private Integer CommodityProvider.version;
    
    public Long CommodityProvider.getId() {
        return this.id;
    }
    
    public void CommodityProvider.setId(Long id) {
        this.id = id;
    }
    
    public Integer CommodityProvider.getVersion() {
        return this.version;
    }
    
    public void CommodityProvider.setVersion(Integer version) {
        this.version = version;
    }
    
}