package com.example.product_api.repository;

import com.example.product_api.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    public List<Product> findByName(String name);

    public Page<Product> findByUserId(Long userId, Pageable pageable);

    public Optional<Product> findByIdAndUserId(int id, Long userId);

}
