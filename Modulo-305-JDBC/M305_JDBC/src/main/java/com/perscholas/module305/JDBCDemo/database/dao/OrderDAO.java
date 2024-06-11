package com.perscholas.module305.JDBCDemo.database.dao;

import com.perscholas.module305.JDBCDemo.database.entity.Order;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OrderDAO {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();

    void insert(Order order) {
        Session session = factory.openSession();
        session.getTransaction().begin();

        // this is the only line that changed
        session.save(order);

        session.getTransaction().commit();
        session.close();
    }


    public void update(Order order) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        // this is the only line that changed
        session.merge(order);
        session.getTransaction().commit();
        session.close();
    }


    public Order findById(Integer id){
        Session session = factory.openSession();

        String hql = "SELECT o FROM Order o WHERE o.id = :id";

        TypedQuery<Order> query = session.createQuery(hql, Order.class);
        query.setParameter("id", id);

        try{
            Order order = query.getSingleResult();
            return  order;
        }catch(NoResultException e){
            return null;
        }finally {
            session.close();
        }

    }

    public List<Order> findOrdersByCustomerId(Integer customerId){
        Session session = factory.openSession();

        String hql = "SELECT o FROM Order o WHERE o.customerId = :customerId";

        TypedQuery<Order> query = session.createQuery(hql, Order.class);
        query.setParameter("customerId", customerId);

        List<Order> orders = query.getResultList();
        return  orders;

    }

}
