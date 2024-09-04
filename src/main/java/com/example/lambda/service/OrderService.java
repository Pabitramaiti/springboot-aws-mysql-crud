package com.example.lambda.service;

import java.util.List;

import com.example.lambda.model.Order;

public interface OrderService {

	public Order saveOrder(Order order);

	public List<Order> saveOrders(List<Order> orders);

	public List<Order> getAllOrders();

	public Order getOrderById(int id);

	public void deleteOrderById(int id);

	//public String updateOrder(Order order);

}
