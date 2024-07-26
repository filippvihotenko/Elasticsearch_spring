package com.example.Elasticsearch_spring.dataModule.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@Table(name = "Sku")
public class ProductSku {

    @Column(name = "sku_id")
    @Id
    private UUID sku_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "memory_size")
    private Integer  memory_size;

    @Column(name = "model")
    private String model;

    @Column(name = "quantity")
    private Integer  quantity;


    @Column(name = "price")
    private BigDecimal price;
}
