package com.lvnt.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.lvnt.model.Product;

/**
 * Created by lvnt
 */
public interface ProductService {

    Product findById(Long id);

    Page<Product> findAllProductsPageable(Pageable pageable);

}
