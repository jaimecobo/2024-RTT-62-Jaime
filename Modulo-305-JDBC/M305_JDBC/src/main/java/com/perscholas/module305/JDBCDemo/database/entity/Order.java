package com.perscholas.module305.JDBCDemo.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ToString.Exclude
    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private  Customer customer;

    @Column(name = "customer_id", nullable = false, insertable = false, updatable = false)
    private Integer customerId;

    @Column(name = "order_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Column(name = "required_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date requiredDate;

    @Column(name = "shipped_date")
    @Temporal(TemporalType.DATE)
    private Date shippedDate;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "comments", columnDefinition = "TEXT")
    private String comments;

}
