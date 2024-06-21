package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.CustomerDTO;
import com.eazybytes.accounts.dto.CustomerDetailsDTO;
import com.eazybytes.accounts.entity.Customer;

public class CustomerMapper {

    private CustomerMapper() {
    }

    public static CustomerDTO mapToCustomerDTO(Customer customer, CustomerDTO customerDTO) {
        customerDTO.setName(customer.getName());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setMobileNumber(customer.getMobileNumber());
        return customerDTO;
    }

    public static CustomerDetailsDTO mapToCustomerDetailsDTO(Customer customer, CustomerDetailsDTO customerDetailsDTO) {
        customerDetailsDTO.setName(customer.getName());
        customerDetailsDTO.setEmail(customer.getEmail());
        customerDetailsDTO.setMobileNumber(customer.getMobileNumber());
        return customerDetailsDTO;
    }

    public static Customer mapToCustomer(CustomerDTO customerDTO, Customer customer) {
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        customer.setMobileNumber(customerDTO.getMobileNumber());
        return customer;
    }
}
