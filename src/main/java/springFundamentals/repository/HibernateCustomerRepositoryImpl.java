package springFundamentals.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import springFundamentals.model.Customer;

@Repository
public class HibernateCustomerRepositoryImpl implements CustomerRepository
{
    @Value("${dbUserName}")
    private String dbUserName;

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

        System.out.println(dbUserName);

        return customerList;
    }
}
