package br.com.paulojj.brewery.services;

import br.com.paulojj.brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Paulo Jorge Junior on 10/02/2020
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID custumerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Paulo Jorge").build();
    }
}
