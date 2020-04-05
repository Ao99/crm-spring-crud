package io.ao9.crmspringcrud.service;

import java.util.List;

import io.ao9.crmspringcrud.entity.Customer;

public interface CustomerService {
    public List<Customer> getCustomers();
}