package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Repository
@Transactional
public interface ItemDao extends CrudRepository<Item, Integer> {
    List<Item> findByPrice(BigDecimal price);
    List<Item> findByValue(BigDecimal value);
    List<Item> findByQuantity(int quantity);
}
