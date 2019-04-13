package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    /**
     * (non-Javadoc)
     * @see {@link CustomerRepository#findAll() }
     *
     * @return
     */
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstname("Rufin");
        customer.setLastname("Hounkpe");

        customers.add(customer);

        return customers;
    }
}
