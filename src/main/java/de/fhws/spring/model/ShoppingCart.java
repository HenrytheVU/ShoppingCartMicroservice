package de.fhws.spring.model;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ShoppingCart {

    @Id
    long id;

    @ElementCollection
    List<Long> itemIds;

    protected ShoppingCart() {
    }

    public ShoppingCart(long id, List<Long> productIds) {
	this.id = id;
	this.itemIds = productIds;
    }

    public long getId() {
	return id;
    }

    public List<Long> getItemIds() {
	return itemIds;
    }

    public Map<Long, Long> getNumberOfItemsById() {
	return this.getItemIds().stream().collect(groupingBy(Long::longValue, counting()));
    }

}
