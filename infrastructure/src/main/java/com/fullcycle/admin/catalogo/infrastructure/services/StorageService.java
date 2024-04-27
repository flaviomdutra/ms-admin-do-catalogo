package com.fullcycle.admin.catalogo.infrastructure.services;

import com.fullcycle.admin.catalogo.domain.video.Resource;

import java.util.Collection;
import java.util.List;

public interface StorageService {

    void deleteAll(Collection<String> names);

    Resource get(String name);

    List<String> list(String prefix);

    void store(String name, Resource resource);

}
