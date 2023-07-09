package com.Guddu.ECommerceApp.repo;

import com.Guddu.ECommerceApp.model.OrderModel;
import org.springframework.data.repository.CrudRepository;

public interface IOrderRepo extends CrudRepository<OrderModel, Integer> {
}
