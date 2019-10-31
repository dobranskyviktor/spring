package springFundamentals.repository;

import java.util.List;

import springFundamentals.model.Customer;

public interface CustomerRepository
{
    List<Customer> finAll();
}
