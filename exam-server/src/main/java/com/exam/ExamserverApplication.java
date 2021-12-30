package com.exam;

import java.util.HashSet;
import java.util.Set;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting");
	// 	 User user = new User();
	// 	 user.setFirstName("fucfhgk");
	// 	 user.setLastName("dog");
	// 	user.setUsername("lolzrty1122");
	// 	 user.setPassword("123");
	// 	 user.setEmail("1@gmail.com");
	//  user.setProfile("no.png");

	//  Role role1 = new Role();
	//  role1.setRoleId(44L);
	//  role1.setRoleName("ADMIN");

	//  Set<UserRole> UserRoleSet = new HashSet<>();
	//  UserRole userRole = new UserRole();
	//  userRole.setRole(role1);
	//  userRole.setUser(user);
	//  UserRoleSet.add(userRole);
		
	// 	User user1 = this.userService.createUser(user, UserRoleSet);
	// 	 System.out.println(user1.getUsername());

	}

}
