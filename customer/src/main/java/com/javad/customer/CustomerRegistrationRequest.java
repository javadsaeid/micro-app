package com.javad.customer;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public record CustomerRegistrationRequest(@NotEmpty String firstName,
                                          @NotEmpty String lastName,
                                          @Email String email) {
}
