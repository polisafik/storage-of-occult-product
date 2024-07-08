package com.polisafik.storage_of_occult_products.repositories;

import com.polisafik.storage_of_occult_products.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
}
