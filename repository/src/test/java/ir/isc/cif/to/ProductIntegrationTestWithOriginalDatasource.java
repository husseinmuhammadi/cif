package ir.isc.cif.to;

import ir.isc.cif.to.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

// @RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.ANY)
public class ProductIntegrationTestWithOriginalDatasource {

    @Autowired
    private EntityManager entityManager;

    @Test
    void name() {
        Product product = new Product();
        product.setName("Nail");
        entityManager.persist(product);
        Assertions.assertThat(product.getId()).isNotNull();
    }
}
