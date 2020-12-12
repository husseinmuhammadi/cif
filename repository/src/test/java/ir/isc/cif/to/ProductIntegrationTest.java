package ir.isc.cif.to;

import ir.isc.cif.to.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@DataJpaTest
public class ProductIntegrationTest {

    Logger logger = LoggerFactory.getLogger(ProductIntegrationTest.class);

    @Autowired
    EntityManager entityManager;

    @BeforeAll
    static void beforeAll() {
    }

    @BeforeEach
    void setUp() {
        initProducts();
    }

    private void initProducts() {
        Product product = new Product();
        product.setName("X");
        entityManager.persist(product);
        Product product1 = new Product();
        product1.setName("Y");
        entityManager.persist(product1);
        Product product3 = new Product();
        product3.setName("Z");
        entityManager.persist(product3);
    }

    @Test
    void whenSaveProduct_thenIdShouldGenerate() {
        Product product = new Product();
        Assertions.assertThat(product.getId()).isNull();
        entityManager.persist(product);
        logger.info("product-id: {}", product.getId());
        Assertions.assertThat(product.getId()).isNotNull();
    }

    @Test
    void whenGetAllProducts_thenShouldBeGreaterThanOrEqualToThree() {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p", Product.class);
        List<Product> products = query.getResultList();
        products.forEach(product -> logger.info(product.toString()));
        Assertions.assertThat(products.size()).isGreaterThanOrEqualTo(3);
    }
}