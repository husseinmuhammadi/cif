package ir.isc.cif.repository;

import ir.isc.cif.to.Product;
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

    List<Product> findByName(String name, Pageable pageable);
}
