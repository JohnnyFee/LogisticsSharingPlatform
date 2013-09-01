package com.lsp.repository;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

import com.lsp.model.transportation.Commodity;

@RooJpaRepository(domainType = Commodity.class)
public interface CommodityRepository {
}
