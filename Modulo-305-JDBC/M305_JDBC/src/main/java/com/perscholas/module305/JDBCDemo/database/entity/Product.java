package com.perscholas.module305.JDBCDemo.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "product_code", nullable = false)
    private String productCode;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "productline_id", nullable = false)
    private Integer productlineId;

    @Column(name = "product_scale", nullable = false)
    private String productScale;

    @Column(name = "product_vendor", nullable = false)
    private String productVendor;

    @Column(name = "product_description", columnDefinition = "TEXT", nullable = false)
    private String productDescription;

    @Column(name = "quantity_in_stock", columnDefinition = "SMALLINT", nullable = false)
    private Integer quantityInStock;

    @Column(name = "buy_price", columnDefinition = "DECIMAL", nullable = false)
    private Double buyPrice;

    @Column(name = "msrp", columnDefinition = "DECIMAL", nullable = false)
    private Double msrp;

}
