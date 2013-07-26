package com.lsp.repository;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

import com.lsp.model.transportation.Vehicle;

@RooJpaRepository(domainType = Vehicle.class)
public interface VihicleRepository {
}
