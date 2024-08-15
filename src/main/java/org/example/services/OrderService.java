package org.example.services;

import org.example.dao.OrderDao;
import org.example.models.Order;

import java.util.List;

public class OrderService {

    private static OrderDao orderDao = new OrderDao();


    public OrderService() {
    }

    public Order findOrder(Long id) {
        return orderDao.findById(id);
    }

    public static void saveOrder(Order order) {
        orderDao.save(order);
    }

    public void deleteOrder(Order order) {
        orderDao.delete(order);
    }

    public void updateOrder(Order order) {
        orderDao.update(order);
    }

    public List<Order> findAllOrders() {
        return orderDao.findAll();
    }

}
