package com.auth.auth.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.auth.auth.entities.Role;
import com.auth.auth.entities.User;
import com.auth.auth.repositories.RoleRepository;
import com.auth.auth.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    // To register and search for users
    @Autowired
    UserRepository userRepository;

    // To search for roles
    @Autowired
    RoleRepository roleRepository;

    // To encode passwords before saving them to the database
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User save(User user) {

        // 1. Both simple users and administrators have the base user role
        Optional<Role> optionalRoleUser = roleRepository.findByName("ROLE_USER");

        // 2. Stores all the roles assigned to a client
        List<Role> roles = new ArrayList<>();

        // 3. We add the user role to the list if the role is available in the database
        optionalRoleUser.ifPresent(roles::add);

        // 4. We check if there is a hidden field in the JSON that indicates that it is an administrator as well
        if (user.isAdmin()) {

            // 5. We bring the ROLE of the database
            Optional<Role> optionalRoleAdmin = roleRepository.findByName("ROLE_ADMIN");

            // 6. We add the admin role to the list if the role is available in the database
            optionalRoleAdmin.ifPresent(roles::add);

        }

        // 7. We add all their roles to the user
        user.setRoles(roles);

        // 8. We encode the password using the PasswordEncoder
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // 9. We save the user to the database and return it
        return userRepository.save(user);

    }

}
