package com.example.mapstruct.springmapstructdemo.dto;

import com.example.mapstruct.springmapstructdemo.model.Item;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProductDTO {

    @Id
    private int id;
    private String name;
    private String description;
    private int quantity;
    private long price;
    private String itemId;

    private List<Item> itemsList;
}
