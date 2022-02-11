package com.example.usersApp;

import com.example.usersApp.Dtos.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import  org.hamcrest.CoreMatchers.*;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class UsersAppApplicationTests {

	@Test
	void contextLoads() {

		List<UserDto> users= new ArrayList<>();

		users.add(new UserDto(1,"Josue","josue@gmail.com"));
		users.add(new UserDto(1,"Wilfredo","Wijoata@gmail.com"));

		assertFalse(users.isEmpty());


	}

}
