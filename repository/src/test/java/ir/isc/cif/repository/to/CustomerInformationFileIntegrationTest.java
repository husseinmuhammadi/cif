package ir.isc.cif.repository.to;

import ir.isc.cif.common.CifNumber;
import ir.isc.cif.to.CustomerInformationFile;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.ANY)
class CustomerInformationFileIntegrationTest {

    Logger logger = LoggerFactory.getLogger(CustomerInformationFileIntegrationTest.class);

    @Autowired
    private EntityManager entityManager;

    @Test
    void name() {
        entityManager.persist(new CustomerInformationFile(CifNumber.randomCifNumber()));
    }
}