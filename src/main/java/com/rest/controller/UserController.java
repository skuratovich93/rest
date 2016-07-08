package com.rest.controller;

import com.rest.domain.User;
import com.rest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author y.skuratovich
 * @since 08.07.2016
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String index() {
        return "Greeting";
    }

}
