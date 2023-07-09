package com.Guddu.ECommerceApp.service;

import com.Guddu.ECommerceApp.repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    IOrderRepo iOrderRepo;

    public  Optional<Orders> getOrderById(Integer id) {
        return iOrderRepo.findById(id);
    }

    public String placeAnOrder(Orders orders) {
        iOrderRepo.save(orders);
        return "Order Placed";
    }

    public List<Orders> getAllOrders() {
        return (List<Orders>) iOrderRepo.findAll();
    }

    public String deleteOrderById(Integer id) {
        iOrderRepo.deleteById(id);

        return "Order Cancelled";
    }
}
