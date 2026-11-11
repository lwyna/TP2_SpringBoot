package com.example.productapi.model;

import java.math.BigDecimal;

public class Product {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer quantity;

    // Constructeurs, getters et setters

    public Product() {
    }

    public Product(String description, Integer quantity, BigDecimal price, Long id, String name) {
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.id = id;
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}