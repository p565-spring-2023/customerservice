package edu.p565.demo1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.p565.demo1.model.Customer;

@Repository
public class CustomerRepository {
    
    List<Customer> customers = new ArrayList<>();

    public List<Customer> findAll(){
        return customers;
    }

    public int create(Customer customer){
        int id = customers.size() + 1;
        customer.setId(id);
        customers.add(customer);
        return id;
    }

    public void update(Customer customer, int id){
        Customer c = customers.stream().filter(x -> x.getId() == id).findAny().orElse(null);
        if(c != null){
           c.setEmail(customer.getEmail());
           c.setName(customer.getEmail());
        }
    }
}


