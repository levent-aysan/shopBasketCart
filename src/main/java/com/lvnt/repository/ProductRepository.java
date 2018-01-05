package com.lvnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lvnt.model.Product;

/**
 * Created by lvnt 
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
