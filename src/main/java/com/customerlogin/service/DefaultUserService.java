package com.customerlogin.service;

import com.customerlogin.dto.UserRegisteredDTO;
import com.customerlogin.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;




public interface DefaultUserService extends UserDetailsService{

    User save(UserRegisteredDTO userRegisteredDTO);





}
