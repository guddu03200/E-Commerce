package com.Guddu.ECommerceApp.service;

import com.Guddu.ECommerceApp.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    IUserRepo iUserRepo;

    public String addUser(User user) {
        iUserRepo.save(user);

        return "User added";
    }

    public List<User> getUsers() {
        return ( List<User>) iUserRepo.findAll();
    }

    public Optional<User> getUser(Integer id) {
        return iUserRepo.findById(id);
    }

    public String updateUserAddressByUserId(Address address, Integer id) {
        User user = iUserRepo.findById(id).orElse(null);
        if(user == null)
        {
            return "User Not Found";
        }
        user.setAddress(address);

        return "user address updated";
    }

    public String addListOfUsers(List<User> user) {
        iUserRepo.saveAll(user);

        return "users Added";
    }
    public String deleteUserById(Integer id) {
        iUserRepo.deleteById(id);

        return "User removed";
    }
}
