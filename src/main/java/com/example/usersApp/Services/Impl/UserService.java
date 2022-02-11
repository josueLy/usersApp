package com.example.usersApp.Services.Impl;

import com.example.usersApp.Dtos.UserDto;
import com.example.usersApp.Services.Interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    public List<UserDto> sendUsers(List<UserDto> userDtos)
    {

        return  userDtos;
    }
}
