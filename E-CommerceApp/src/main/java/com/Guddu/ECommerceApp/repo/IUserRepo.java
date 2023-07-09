package com.Guddu.ECommerceApp.repo;

import com.Guddu.ECommerceApp.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<UserModel, Integer> {
}
