package org.example.dao;

import org.example.models.Product;
import org.example.utils.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ProductDao {



    public Product findById(Long id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Product.class, id);
    }

    public void save(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(product);
        tx1.commit();
        session.close();
    }

    public void update(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(product);
        tx1.commit();
        session.close();
    }

    public void delete(Product product) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(product);
        tx1.commit();
        session.close();
    }


    public List<Product> findAll() {
        List<Product> products = (List<Product>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Product").list();
        return products;
    }
}
