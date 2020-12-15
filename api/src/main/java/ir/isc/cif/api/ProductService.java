package ir.isc.cif.api;

import ir.isc.cif.dto.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();

    Page<Product> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Product product);

    List<Product> getTopProducts();

    Optional<Product> findById(Long id);
}
