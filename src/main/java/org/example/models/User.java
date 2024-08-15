package org.example.models;


import jakarta.persistence.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String name;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> orders;

    public User() {
    }

    public User(String name) {
        this.name = name;
        orders = new ArrayList<>();
    }

    public User(String name, Order order) {
        this.name = name;
        orders = new ArrayList<>();
        orders.add(order);
    }


    public void addOrder(Order order) {
        order.setUser(this);
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("orders", orders)
                .toString();
    }



}
