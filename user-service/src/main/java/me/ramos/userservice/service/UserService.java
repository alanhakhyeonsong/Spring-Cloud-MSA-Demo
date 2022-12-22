package me.ramos.userservice.service;

import me.ramos.userservice.dto.UserDto;
import me.ramos.userservice.entity.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}
