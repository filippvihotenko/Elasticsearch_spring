package com.example.Elasticsearch_spring.dataModule.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@Table(name = "Product")
public class Product {

    @Id
    @Column(name = "product_id", unique = true)
    private UUID product_id;

    @Column(name = "product_name",unique = true)
    @NotNull
    private String product_name;


    @Column(name = "start_date")
    private ZonedDateTime startDate;

    @Column(name = "active")
    @NotNull
    private boolean active;

    @OneToMany(mappedBy = "product")
    private Set<ProductSku> productSkuSet;

}
