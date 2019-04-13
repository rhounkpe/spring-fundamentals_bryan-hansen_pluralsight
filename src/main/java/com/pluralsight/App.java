package com.pluralsight;

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstname());

        service.findAll().stream()
                .map(Customer::getFirstname)
                .forEach(System.out::println);
    }
}
