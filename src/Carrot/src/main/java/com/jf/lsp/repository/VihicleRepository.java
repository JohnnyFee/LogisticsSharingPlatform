package com.jf.lsp.repository;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

import com.jf.lsp.model.transportation.Vehicle;

@RooJpaRepository(domainType = Vehicle.class)
public interface VihicleRepository {
}
