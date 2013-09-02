package com.jf.lsp.repository;

import org.springframework.roo.addon.layers.repository.jpa.RooJpaRepository;

import com.jf.lsp.model.transportation.Information;

@RooJpaRepository(domainType = Information.class)
public interface InformationRepository {
}
