package ir.isc.cif.repository.to;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;

@DataJpaTest
class ProductTest {

    Logger logger = LoggerFactory.getLogger(ProductTest.class);

    @Autowired
    EntityManager entityManager;

    @Test
    void name() {
        Product product = new Product();
        entityManager.persist(product);
        logger.info("----------------------> {}", product.getId());
    }


}