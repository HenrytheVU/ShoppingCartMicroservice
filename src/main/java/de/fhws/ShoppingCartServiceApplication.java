package de.fhws;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import de.fhws.spring.model.ShoppingCart;
import de.fhws.spring.repository.ShoppingCartRepository;

@SpringBootApplication
public class ShoppingCartServiceApplication {

    public static void main(String[] args) {
	SpringApplication.run(ShoppingCartServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ShoppingCartRepository shoppingCartRepository) {
	return (evt) -> {

	    final List<Long> cardProductIds = Arrays.asList(1L, 1L, 2L, 2L, 2L);

	    final ShoppingCart cart = new ShoppingCart(1, cardProductIds);
	    shoppingCartRepository.save(cart);
	};
    }
}
