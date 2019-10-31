package springFundamentals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springFundamentals.constants.SpringConstants;
import springFundamentals.model.Customer;
import springFundamentals.repository.CustomerRepository;

@Service(SpringConstants.CUSTOMER_SERVICE)
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll()
    {
        return customerRepository.finAll();
    }
}
