package com.example.usersApp.Controllers;

import com.example.usersApp.Dtos.UserDto;

import com.example.usersApp.Services.Impl.UserService;
import com.example.usersApp.Services.Interfaces.IUserService;
import com.example.usersApp.helper.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class UserController {


    @Autowired
    private IUserService userService;

    @PostMapping("/{users}")
    public ResponseEntity<Response> getUsers(@RequestBody List<UserDto> users, BindingResult result)
    {

        return ResponseEntity.ok(new Response("Lista de usuarios", HttpStatus.OK, userService.sendUsers(users) ));
    }
}
