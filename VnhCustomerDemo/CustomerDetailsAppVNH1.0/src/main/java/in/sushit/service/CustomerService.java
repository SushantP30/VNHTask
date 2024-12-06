package in.sushit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sushit.entity.Customer;
import in.sushit.repo.BusinessRequirementRepository;
import in.sushit.repo.CustomerRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private BusinessRequirementRepository businessRequirementRepository;

    public Customer createCustomer(Customer customer) {
        // Validate date of birth before saving
        if (customer.getDob().isAfter(LocalDate.of(2002, 1, 1))) {
            throw new IllegalArgumentException("DOB should be < 01-01-2002");
        }
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer updateCustomer(Long id, Customer customerDetails) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
        customer.setName(customerDetails.getName());
        customer.setSex(customerDetails.getSex());
        customer.setDob(customerDetails.getDob());
        customer.setNativeLocation(customerDetails.getNativeLocation());
        customer.setAccountType(customerDetails.getAccountType());
        customer.setContractType(customerDetails.getContractType());
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
