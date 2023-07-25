package com.amol.spring.boot;

import com.amol.spring.boot.dao.UserRepository;
import com.amol.spring.boot.entities.Users;
import org.apache.catalina.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class BootsecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootsecondApplication.class, args);
		ApplicationContext context = SpringApplication.run(BootsecondApplication.class);
		UserRepository userRepository =  context.getBean(UserRepository.class);

//		Users myuser = new Users();
//
//		myuser.setUserName("Nikhil Rawat");
//		myuser.setCityName("Nagpur");
//		myuser.setStatus("ok");
//		myuser.setIsActive(true);
//		System.out.println("init done!");
//		Users user1 = userRepository.save(myuser);
//
//		System.out.println(user1);
//		System.out.println("done!");

//		#Create users
//		Users user1 = new Users();
//		user1.setIsActive(true);
//		user1.setUserName("Ram Bang");
//		user1.setCityName("Calcutta");
//		user1.setStatus("Programmer");
//
//		Users user2 = new Users();
//		user2.setIsActive(false);
//		user2.setUserName("Ram Kashid");
//		user2.setCityName("Mumbai");
//		user2.setStatus("Trainee Analyst");


// 		Users result = userRepository.save(user2); // -- single user saved

//		List<Users> usersList = List.of(user1,user2);
//		Iterable<Users> ress = userRepository.saveAll(usersList);
//		ress.forEach(users -> {
//			System.out.print(users +"  ");
//		});

//	#Update Users
//
//	Optional<Users>	optional = userRepository.findById(5);
//	Users users = optional.get();
//
//	users.setUserName("Manohar Malhotra");
//
//	Users save = userRepository.save(users);
//	System.out.println(save.getUserName());

//		Iterable<Users> iterable = userRepository.findAll();
//		iterable.forEach(users -> {System.out.println(users.userName+"	=> "+users.getUserId());});

//		#Delete Operation

//		userRepository.deleteById(8);
//		System.out.println("deleted!");

//		Iterable<Users> delUsers  =userRepository.findAll();
//		delUsers.forEach(users -> System.out.println(users));
//		userRepository.deleteAll(delUsers);





	}



}
