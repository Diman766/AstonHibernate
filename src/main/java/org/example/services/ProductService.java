package org.example.services;

import org.example.dao.ProductDao;
import org.example.models.Product;

import java.util.List;

public class ProductService {

    private static ProductDao productsDao = new ProductDao();

    public ProductService() {
    }

    public static Product findProduct(Long id) { return productsDao.findById(id); }

    public void saveProduct(Product product) {
        productsDao.save(product);
    }

    public void deleteProduct(Product product) {
        productsDao.delete(product);
    }

    public void updateProduct(Product product) {
        productsDao.update(product);
    }

    public List<Product> findAllProduct() {
        return productsDao.findAll();
    }
}
