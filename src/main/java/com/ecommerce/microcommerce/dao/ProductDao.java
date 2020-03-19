package com.ecommerce.microcommerce.dao;

/**
 *
 * @author Nell David MOUKOKO
 */

import com.ecommerce.microcommerce.model.Product;

import java.util.List;

public interface ProductDao {
    public List<Product>findAll();
    public Product findById(int id);
    public Product save(Product product);
}
