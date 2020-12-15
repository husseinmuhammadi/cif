package ir.isc.cif.repository;

import ir.isc.cif.to.CustomerInformationFile;
import ir.isc.cif.to.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CifRepository extends JpaRepository<CustomerInformationFile, Long>, JpaSpecificationExecutor<CustomerInformationFile> {
    CustomerInformationFile findByCifNumber(String cifNumber);

    List<CustomerInformationFile> findAll();

    Page<CustomerInformationFile> findAll(Pageable pageable);

    List<CustomerInformationFile> findByCustomerId(Long customerId);
}
