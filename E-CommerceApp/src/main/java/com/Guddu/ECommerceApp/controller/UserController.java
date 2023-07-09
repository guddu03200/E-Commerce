package com.Guddu.ECommerceApp.controller;

import com.Guddu.ECommerceApp.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    //post
    @PostMapping("user")
    public String addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }

    @PostMapping("Users")
    public String addListOfUsers(@RequestBody List<User> user) {return userService.addListOfUsers(user);}

    @GetMapping("user/{Id}")
    public Optional<User> getUser(@PathVariable Integer Id)
    {
        return userService.getUser(Id);
    }

    @GetMapping("users")
    public List<User> getProducts()
    {
        return userService.getUsers();
    }
//    @PutMapping("user/address/{id}")
//    public String updateUserAddressByUserId(@RequestBody Address address, @PathVariable Integer id)
//    {
//        return userService.updateUserAddressByUserId(address,id);
//    }

    @DeleteMapping("user/{id}")
    public String deleteUserById(@PathVariable Integer id)
    {
        return userService.deleteUserById(id);
    }

}
