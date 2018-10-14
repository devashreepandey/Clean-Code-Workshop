package com.thoughtworks.movierental.services;

import com.thoughtworks.movierental.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

  // This is for demonstration purpose only. Assume it is making real database calls.

  private List<Customer> customers = new ArrayList<>();

  public CustomerService(){
  }
  public List<Customer> getAll(){
    return customers;
  }

  public void save(List<Customer> customers){
    this.customers = customers;
  }
}
