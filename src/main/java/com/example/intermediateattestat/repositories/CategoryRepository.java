package com.example.intermediateattestat.repositories;

import com.example.intermediateattestat.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    com.example.intermediateattestat.models.Category findByName(String name);
}
