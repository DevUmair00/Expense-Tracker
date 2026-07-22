package com.umair.Backend.service;

import com.umair.Backend.entity.User;
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
        return userRepo.save(user);
    }

    public void deleteUser(Long id)
    {
        userRepo.deleteById(id);
    }

    public User updateUser(Long id , User user)
    {
        User temp = userRepo.findById(id).orElse(null);

        if(temp != null)
        {
            temp.setName(user.getName());
            temp.setEmail(user.getEmail());
            temp.setPassword(user.getPassword());

            return userRepo.save(temp);
        }

        return null;
    }

    public User getUserById(Long id)
    {
        return userRepo.findById(id).orElse(null);
    }

    public List<User> getAllUsers()
    {
        return userRepo.findAll();
    }
}
