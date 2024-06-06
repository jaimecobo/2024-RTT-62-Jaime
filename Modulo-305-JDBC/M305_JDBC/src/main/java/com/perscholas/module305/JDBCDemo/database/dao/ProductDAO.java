package com.perscholas.module305.JDBCDemo.database.dao;

import com.perscholas.module305.JDBCDemo.database.entity.Product;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ProductDAO {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();


    public void update(Product product) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        // this is the only line that changed
        session.merge(product);
        session.getTransaction().commit();
        session.close();
    }

    public Product findById(Integer id){
        Session session = factory.openSession();

        String hql = "SELECT p FROM Product p WHERE p.id = :id";

        TypedQuery<Product> query = session.createQuery(hql, Product.class);
        query.setParameter("id", id);

        try{
            Product product = query.getSingleResult();
            return  product;
//        }catch(Exception e){
        }catch(NoResultException e){
            return null;
        }finally {
            session.close();
        }

    }

    public List<Product> findByName(String productName){
        Session session = factory.openSession();

        // This is referred to HQL or JQL, both are the same thing
        // HQL uses the java class names -- HQL uses the java class names -- HQL uses the java class names
        String hql = "SELECT p FROM Product p WHERE p.productName = :productName";

        TypedQuery<Product> query = session.createQuery(hql, Product.class);
        query.setParameter("productName", productName);

        // getResultList() will always return a List, so there is no need to worry about null
        // If the query finds no results, the List will be empty
        List<Product> products = query.getResultList();

        session.close();

        return  products;
    }

    public List<Product> findLikeName(String productName){
        Session session = factory.openSession();

        // Create query to be ... select * from products where product_name like'%name%';
        // Basically the CONCAT adds the % to the beginning and to the end of the incoming variable
        // % is a wildcard meaning matches any character any number of times
//        String hql = "SELECT p FROM Product p WHERE p.productName like CONCAT('%', :productName, '%')";

        // By adding thw lower function to the product names and the incoming variables you make this query case-insensitive
        String hql = "SELECT p FROM Product p WHERE lower(p.productName) like lower(CONCAT('%', :productName, '%'))";
//        String hql = "select p from Product p where lower(p.productName) like lower(CONCAT('%', :productName, '%'))";



        TypedQuery<Product> query = session.createQuery(hql, Product.class);
        query.setParameter("productName", productName);

        List<Product> products = query.getResultList();

        session.close();

        return  products;
    }

}
