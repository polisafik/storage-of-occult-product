package com.polisafik.storage_of_occult_products.services;

import com.polisafik.storage_of_occult_products.models.Product;
import com.polisafik.storage_of_occult_products.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    /**
     * Create a new product.
     * @param product the product to save
     * @return the saved product
     */
    public Product createProduct(@Valid Product product) {
        return productRepository.save(product);
    }

    /**
     * Update an existing product.
     * @param product the product with updated fields
     * @return the updated product
     */
    public Product updateProduct(@Valid Product product) {
        return productRepository.save(product);
    }

    /**
     * Find a product by its ID.
     * @param id the UUID of the product
     * @return an optional containing the product if found
     */
    public Optional<Product> getProduct(UUID id) {
        return productRepository.findById(id);
    }

    /**
     * List all products.
     * @return a list of all products
     */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * Delete a product by its ID.
     * @param id the UUID of the product to delete
     */
    public void deleteProduct(UUID id) {
        productRepository.deleteById(id);
    }

}
