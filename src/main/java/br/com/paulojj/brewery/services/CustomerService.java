package br.com.paulojj.brewery.services;

import br.com.paulojj.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID custumerId);
}
