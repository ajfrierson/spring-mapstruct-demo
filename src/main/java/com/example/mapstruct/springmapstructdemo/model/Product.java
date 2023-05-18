package com.example.mapstruct.springmapstructdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
@Table
public class Product {

    @Id
    private int id;
    private String name;
    private String desc;
    private int quantity;
    private long price;
    private String itemId;

    private List<Item> items;
}
