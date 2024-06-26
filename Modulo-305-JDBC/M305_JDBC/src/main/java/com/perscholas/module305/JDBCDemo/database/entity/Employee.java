package com.perscholas.module305.JDBCDemo.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

// Instead of having to type in all the setters and getters, we can use lombok annotations as shown below
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

    @Id                                                     // This annotation is telling to Hibernate that this is the Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // This annotation is telling to Hibernate that it must AUTO_INCREMENT
    @Column(name = "id")
    private Integer id;

    @ToString.Exclude
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Customer> customers;

    /*
    Example from: https://attacomsian.com/blog/spring-data-jpa-one-to-many-mapping
    @OneToMany(mappedBy = "book", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Page> pages;
     */

    @Column(name = "office_id")
    private Integer officeId;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "extension")
    private String extension;

    @Column(name = "email")
    private String email;

    @Column(name = "reports_to")
    private Integer reportsTo;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "vacation_hours")
    private Integer vacationHours;

    @Column(name = "profile_image_url")
    private String profileImageURL;

}
