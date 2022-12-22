package me.ramos.catalogservice.service;

import lombok.RequiredArgsConstructor;
import me.ramos.catalogservice.entity.CatalogEntity;
import me.ramos.catalogservice.repository.CatalogRepository;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService {

    private final CatalogRepository catalogRepository;
    private final Environment env;

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return catalogRepository.findAll();
    }
}
