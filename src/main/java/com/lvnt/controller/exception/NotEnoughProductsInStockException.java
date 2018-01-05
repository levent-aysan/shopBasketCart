package com.lvnt.controller.exception;

import com.lvnt.model.Product;

/**
 * Created by lvnt on 4/1/18.
 */
public class NotEnoughProductsInStockException extends Exception {

    private Product product;
    private static final String DEFAULT_MESSAGE = "Not enough products in stock";

    public NotEnoughProductsInStockException() {
        super(DEFAULT_MESSAGE);
    }

    public NotEnoughProductsInStockException(Product product) {
        super("Not enough " + product.getName() + " products in stock. Only " + product.getQuantity() + " left");

        this.product = product;
    }

}
