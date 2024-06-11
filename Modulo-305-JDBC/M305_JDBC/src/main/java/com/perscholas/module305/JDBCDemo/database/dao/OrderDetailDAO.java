package com.perscholas.module305.JDBCDemo.database.dao;

import com.perscholas.module305.JDBCDemo.database.entity.OrderDetail;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrderDetailDAO {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();


    public void insert(OrderDetail orderDetail) {
        Session session = factory.openSession();
        session.getTransaction().begin();

        // this is the only line that changed
        session.save(orderDetail);

        session.getTransaction().commit();
        session.close();
    }


    public OrderDetail findByOrderIdAndProductId(Integer orderId, Integer productId) {
        Session session = factory.openSession();

        String hql = "SELECT od FROM OrderDetail od where od.product.id = :productId and od.order.id = :orderId";

        TypedQuery<OrderDetail> query = session.createQuery(hql,OrderDetail.class);
        query.setParameter("orderId", orderId);
        query.setParameter("productId", productId);

        try {
            OrderDetail result = query.getSingleResult();
            return result;
        } catch ( Exception e ) {
            return null;
        } finally {
            session.close();
        }
    }


    public OrderDetail findById(Integer id) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "SELECT od FROM OrderDetail od where od.product.id = :id";
        TypedQuery<OrderDetail> query = session.createQuery(hql,OrderDetail.class);
        query.setParameter("id", id);


        try {
            OrderDetail result = query.getSingleResult();
            return result;
        } catch ( Exception e ) {
            return null;
        } finally {
            // finally we close the hibernate session so it can release the resources its holding
            // specifically the connection pool and close the transaction
            session.close();
        }

    }
}
