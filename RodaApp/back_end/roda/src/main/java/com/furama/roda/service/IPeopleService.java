package com.furama.roda.service;

import com.furama.roda.model.People;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IRodaService {
    Page<People> findAll(Pageable pageable);
}
