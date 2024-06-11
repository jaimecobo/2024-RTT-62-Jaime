package com.perscholas.module305.JDBCDemo.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orderdetails")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Column(name = "order_id", nullable = false, insertable=false, updatable=false)
    private Integer orderId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "product_id", nullable = false, insertable=false, updatable=false)
    private Integer productId;

    @Column(name = "quantity_ordered", nullable = false)
    private Integer quantityOrdered;

    @Column(name = "price_each", columnDefinition = "DECIMAL", nullable = false)
    private Double priceEach;

    @Column(name = "order_line_number", columnDefinition = "SMALLINT", nullable = false)
    private Integer orderLineNumber;

}
