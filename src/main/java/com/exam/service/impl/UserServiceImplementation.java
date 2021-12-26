package com.exam.service.impl;

import java.util.Set;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        // TODO Auto-generated method stub

        User result = this.userRepository.findByUsername(user.getUsername());
        //add to database
        if(result != null){
            System.out.println("Username is in used");
            throw new Exception("Username is in used");
        }else{
            for (UserRole ur: userRoles){
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            result = this.userRepository.save(user);
        }
        return result;
    }
    
}
