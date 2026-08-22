package com.umair.Backend.service;

import com.umair.Backend.entity.User;
import com.umair.Backend.exception.ResourceNotFoundException;
import com.umair.Backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository  userRepo;

    public User createUser(User user)
    {
        if(userRepo.existsByEmail(user.getEmail()))
        {
            throw new RuntimeException("Email already exists");
        }

        return userRepo.save(user);
    }

    public void deleteUser(Long id)
    {
        User user = userRepo.findById(id).orElseThrow(() ->
                new ResourceNotFoundException(
                        "User not found with id " + id
                )
        );

        userRepo.delete(user);
    }

    public User updateUser(Long id , User user)
    {

        User temp = userRepo.findById(id).orElseThrow(() ->
                new ResourceNotFoundException(
                        "User Not found with id " + id
                )
        );

        temp.setName(user.getName());
        temp.setEmail(user.getEmail());
        temp.setPassword(user.getPassword());

        return userRepo.save(temp);
    }

    public User getUserById(Long id)
    {
        return userRepo.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "user Not Found with id : " + id
                        )
                );
    }

    public List<User> getAllUsers()
    {
        return userRepo.findAll();
    }


    public User getUserByEmail(String email) {

            return userRepo.findByEmail(email);
    }

    public List<User> getUserByNameContaining(String name)
    {
            return userRepo.findByNameContaining(name);
    }

}