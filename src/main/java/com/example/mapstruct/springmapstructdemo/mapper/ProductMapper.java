package com.example.mapstruct.springmapstructdemo.mapper;

import com.example.mapstruct.springmapstructdemo.dto.ProductDTO;
import com.example.mapstruct.springmapstructdemo.model.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.UUID;


@Mapper(componentModel = "spring", imports = UUID.class)
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);


    @Mapping(source = "product.desc", target = "description", defaultValue = "description")
    ProductDTO modelToDto(Product product);

    ProductDTO modelTODtos(List<Product> product);

    @InheritInverseConfiguration
    Product dtoToModel(ProductDTO productDTO);





}
