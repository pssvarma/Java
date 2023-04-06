package com.microservices.micro.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class test {
	
	
	public static void main(String args[]) {
		
		List<User> list=new ArrayList<User>();
		  User user = new User();
	     user.setId(Long.valueOf(1));
		list.add(user);
		//list.add(2);
		Optional<User> i =list.stream().filter(u->user.getId()==1).findFirst();
		System.out.println(i);
	}

}
