package de.fhws.spring.repository;

import org.springframework.data.repository.CrudRepository;

import de.fhws.spring.model.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
