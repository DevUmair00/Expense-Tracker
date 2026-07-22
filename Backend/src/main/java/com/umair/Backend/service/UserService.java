package com.umair.Backend.service;

import com.umair.Backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service     //Make It Service
public class UserService {

    @Autowired
    private UserRepository  userRepo;
}
