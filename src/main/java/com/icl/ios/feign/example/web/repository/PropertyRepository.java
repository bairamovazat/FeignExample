package com.icl.ios.feign.example.web.repository;

import com.icl.ios.feign.example.web.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PropertyRepository extends JpaRepository<Property, Long> {
    Optional<Property> findFirstByNameEquals(String name);
}
