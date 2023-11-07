package com.jipsoft.produmax.controllers;

import com.jipsoft.produmax.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    List<User> getAll() {
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setName("Jipson");
        user.setLastname("Saad");
        list.add(user);
        return list;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User get(@PathVariable String id) {
        User user = new User();
        user.setName("Jipson");
        user.setLastname("Saad");
        return user;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    User register(@RequestBody User user) {
        // TODO: register user into bdd
        return user;
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    User update(@RequestBody User user) {
        // TODO: update user into bdd
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    void update(@PathVariable String id) {
        // TODO: update user into bdd
    }
}
