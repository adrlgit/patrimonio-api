package com.andre.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
