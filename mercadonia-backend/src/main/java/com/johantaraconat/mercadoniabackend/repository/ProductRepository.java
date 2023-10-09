package com.johantaraconat.mercadoniabackend.repository;

import com.johantaraconat.mercadoniabackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
