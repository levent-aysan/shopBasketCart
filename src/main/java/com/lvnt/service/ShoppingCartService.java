package com.lvnt.service;

import java.math.BigDecimal;
import java.util.Map;

import com.lvnt.controller.exception.NotEnoughProductsInStockException;
import com.lvnt.model.Product;

/**
 * Created by lvnt
 */
public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
}
