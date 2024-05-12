package com.perscholas.java_basics.GLAB_303_11_3;
/*
Lab Objective
In the following lab, you will learn how to create an ArrayList of user-defined objects.
We will utilize Arraylist, constructors, getters, and setters. This concept is very important for future lectures such as DAO, Hibernate, and Spring Boot.
*/
public class Book {
/*
This is actually a POJO class for setter and getter.
*/
    private  int number;
    private  String name;
    private String author;
    private  String category;
    // Constructor with arguments
    public Book(int number, String name, String author, String category)
    {
        this.name = name;
        this.category = category;
        this.author = author;
        this.number = number;
    }
    // Constructor without arguments
    public Book()
    {

    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name1) {
        this.name = name1;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
