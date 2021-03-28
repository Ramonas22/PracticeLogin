package net.javaguides.registrationloginspringbootsecuritythymeleaf.service;

import net.javaguides.registrationloginspringbootsecuritythymeleaf.model.User;
import net.javaguides.registrationloginspringbootsecuritythymeleaf.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
