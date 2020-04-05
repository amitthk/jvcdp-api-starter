package com.jvcdp.repository;

import com.jvcdp.model.AppComponentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AppComponentService extends JpaRepository<AppComponentEntity, Long> {
}
