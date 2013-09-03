package com.jf.carrot.repository;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

import com.jf.carrot.model.transportation.Vehicle;

@RooJpaRepository(domainType = Vehicle.class)
public interface VihicleRepository {
}
