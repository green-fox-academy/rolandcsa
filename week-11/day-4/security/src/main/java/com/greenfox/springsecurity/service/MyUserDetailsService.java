package com.greenfox.springsecurity.service;

import com.greenfox.springsecurity.model.MyUserDetails;
import com.greenfox.springsecurity.model.User;
import com.greenfox.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> optionalUser = userRepository.findUserByUsername(username);

        optionalUser.orElseThrow(() -> new UsernameNotFoundException("Not found " + username));

        return optionalUser.map(MyUserDetails::new).get();
    }
}
