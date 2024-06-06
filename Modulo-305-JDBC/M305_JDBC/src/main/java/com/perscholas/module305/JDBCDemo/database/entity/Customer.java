package com.perscholas.module305.JDBCDemo.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ToString.Exclude
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Order> orders;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "contact_lastname", nullable = false)
    private String contactLastname;

    @Column(name = "contact_firstname", nullable = false)
    private String contactFirstname;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "address_line1", nullable = false)
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country", nullable = false)
    private  String country;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "sales_rep_employee_id", nullable = true)
    private  Employee employee;

    /*
    Example from: https://attacomsian.com/blog/spring-data-jpa-one-to-many-mapping
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
     */

    @Column(name = "sales_rep_employee_id", insertable = false, updatable = false)
    private Integer salesRepEmployeeId;

    @Column(name = "credit_limit", columnDefinition = "DECIMAL")
    private Double creditLimit;

}
