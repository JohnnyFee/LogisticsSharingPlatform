package com.jf.carrot.repository;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

import com.jf.carrot.model.transportation.Commodity;

@RooJpaRepository(domainType = Commodity.class)
public interface CommodityRepository {
}
