package com.okestate.adminapi.repository;

import com.okestate.adminapi.domain.property.EstateProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstatePropertyRepository extends JpaRepository<EstateProperty, Long> {
}
