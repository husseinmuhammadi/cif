package com.asan.cms.repository;

import ir.isc.cif.repository.to.Product;
import ir.isc.cif.repository.to.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
    Product findByName(String name);

    Page<Product> findAll(Pageable pageable);

    Page<Product> findAllByCategory(ProductCategory productCategory, Pageable pageable);

    List<Product> findAllByCategory(ProductCategory productCategory);

    List<Product> findByName(String name, Pageable pageable);
}