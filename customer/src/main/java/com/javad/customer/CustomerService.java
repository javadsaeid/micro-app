package com.javad.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService(CustomerRepo customerRepo) {

    public void register(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo check if email valid
        // todo check if email not taken


        customerRepo.save(customer);
    }
}
