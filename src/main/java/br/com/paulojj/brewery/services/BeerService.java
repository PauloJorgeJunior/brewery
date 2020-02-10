package br.com.paulojj.brewery.services;

import br.com.paulojj.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
