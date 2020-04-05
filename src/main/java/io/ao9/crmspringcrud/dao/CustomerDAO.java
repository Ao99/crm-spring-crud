package io.ao9.crmspringcrud.dao;

import java.util.List;

import io.ao9.crmspringcrud.entity.Customer;

public interface CustomerDAO {
    public List<Customer> getCustomers();
}