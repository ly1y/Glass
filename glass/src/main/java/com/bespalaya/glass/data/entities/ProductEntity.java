package com.bespalaya.glass.data.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String characteristic;
    private Double price;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity orderEntity;
    @OneToOne
    @JoinColumn(name = "category_id" )
    private CategoryEntity categoryEntity;

}
