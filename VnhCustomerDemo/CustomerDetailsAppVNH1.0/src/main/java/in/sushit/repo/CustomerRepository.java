package in.sushit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sushit.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
