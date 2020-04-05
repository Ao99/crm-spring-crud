package io.ao9.crmspringcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.ao9.crmspringcrud.dao.CustomerDAO;
import io.ao9.crmspringcrud.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping("/list")
    public String hello(Model theModel) {
        List<Customer> theCustomers = customerDAO.getCustomers();        
        System.out.println(theCustomers);
        theModel.addAttribute("customers", theCustomers);
        return "list-customers";
    }
}