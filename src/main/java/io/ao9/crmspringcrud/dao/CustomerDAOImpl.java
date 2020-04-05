package io.ao9.crmspringcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.ao9.crmspringcrud.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
    @Autowired
    private EntityManager entityManager;

    private Session getSession() {
        Session theSession = null;
        if (entityManager == null || (theSession = entityManager.unwrap(Session.class)) == null) {
            throw new NullPointerException();
        }
        return theSession;
    }

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        Session theSession = getSession();
        Query<Customer> theQuery = theSession.createQuery("from Customer", Customer.class);
        List<Customer> theCustomers = theQuery.getResultList();        
        return theCustomers;
    }

}