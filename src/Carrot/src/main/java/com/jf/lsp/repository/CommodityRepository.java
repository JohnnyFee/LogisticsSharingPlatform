package com.jf.lsp.repository;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

import com.jf.lsp.model.transportation.Commodity;

@RooJpaRepository(domainType = Commodity.class)
public interface CommodityRepository {
}
