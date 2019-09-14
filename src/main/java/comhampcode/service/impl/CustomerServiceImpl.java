package comhampcode.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comhampcode.model.entity.Customer;
import comhampcode.model.repository.CustomerRepositoty;
import comhampcode.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepositoty customerRepository;

	@Override
	public Customer saveOrUpdate(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAll() throws Exception {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> gerById(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id);
	}

}
