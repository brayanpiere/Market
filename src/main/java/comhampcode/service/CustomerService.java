package comhampcode.service;

import java.util.List;
import java.util.Optional;

import comhampcode.model.entity.Customer;

public interface CustomerService {
	
	Customer saveOrUpdate(Customer customer);
	
	List<Customer> getAll()throws Exception;
	
	Optional<Customer> gerById(Long id);
	
	

}
