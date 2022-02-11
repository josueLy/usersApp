package com.example.usersApp.Services.Interfaces;

import com.example.usersApp.Dtos.UserDto;

import java.util.List;

public interface IUserService {

    List<UserDto> sendUsers(List<UserDto> userDtos);
}
