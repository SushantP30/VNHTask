package in.sushit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sushit.entity.BusinessRequirement;
@Repository
public interface BusinessRequirementRepository extends JpaRepository<BusinessRequirement, Long> {

}
