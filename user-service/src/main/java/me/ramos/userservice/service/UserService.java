package me.ramos.userservice.service;

import me.ramos.userservice.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
