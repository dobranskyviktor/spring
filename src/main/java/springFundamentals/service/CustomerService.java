package springFundamentals.service;

import java.util.List;

import springFundamentals.model.Customer;

public interface CustomerService
{
    List<Customer> findAll();
}
