package com.johantaraconat.mercadoniabackend.repository;

import com.johantaraconat.mercadoniabackend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
