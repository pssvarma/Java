package com.microservices.micro.rest;

import java.net.URI;
import java.util.NoSuchElementException;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.microservices.micro.rest")
@RequestMapping("/Users")
public class Users {

	@Autowired
	private UserDAO<User> userDAO;

	@GetMapping("/")
	public String getUser() {
		return "Varma";
	}

	@GetMapping("/{userid}")
	public ResponseEntity<User> getUser(@PathVariable Long userid) {

		try {
			User user = userDAO.get(userid).get();

			if (user != null) {
				return ResponseEntity.ok(user);
			} else {
				return ResponseEntity.notFound().build();
			}
		} catch (NoSuchElementException e) {
			// User with the given ID was not found
			return ResponseEntity.notFound().build();
		} catch (Exception e) {
			// Some other exception occurred
			return ResponseEntity.status(HttpStatus.SC_INTERNAL_SERVER_ERROR).build();
		}
	}

	@PostMapping()
	public ResponseEntity<Void> addUser(@RequestBody User user) {
		User saveduser = userDAO.save(user);
		return ResponseEntity.created(URI.create("/users/" + saveduser.getId())).build();
	}

	public void getUserCount() {

	}

}
