package comhampcode.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import comhampcode.model.entity.Customer;

@Repository
public interface CustomerRepositoty extends JpaRepository<Customer, Long>{
	
	Optional<Customer> findByDni(String dni);
	
	@Query("SELECT c FROM Customer c WHERE c.dni=?1")
	List<Customer> gerByDni(String dni);
	
	@Query(value="SELECT c FROM Customer c WHERE c.dni=?1", nativeQuery= true)
	List<Customer> fetchByDni(String dni);

}
