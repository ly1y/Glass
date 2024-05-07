package com.bespalaya.glass.data.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer count;
    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "order_date")
    private LocalDate orderDate;
    @OneToMany
    @JoinColumn
    private List<ProductEntity> product;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientEntity client;
}
