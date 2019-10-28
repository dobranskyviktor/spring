package repository;

import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository
{
    @Override
    public List<Customer> finAll()
    {
        List<Customer> customerList = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Viktor");
        customer.setLastName("Dob");

        Customer customer1 = new Customer();
        customer1.setFirstName("Janko");
        customer1.setLastName("Mrkva");

        customerList.add(customer);
        customerList.add(customer1);

        return customerList;
    }
}
