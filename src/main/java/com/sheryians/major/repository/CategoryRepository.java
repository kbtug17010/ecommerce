package com.sheryians.major.repository;

import com.sheryians.major.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Locale;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
