package com.javad.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
public record CustomerController(CustomerService customerService) {


    @GetMapping
    public ResponseEntity<String> index() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
    @Validated
    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest customer) {
        log.info("Registering customer: {}", customer);
        customerService.register(customer);
    }
}
