package com.Guddu.ECommerceApp.repo;

import com.Guddu.ECommerceApp.model.AddressModel;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<AddressModel, Integer> {
}
