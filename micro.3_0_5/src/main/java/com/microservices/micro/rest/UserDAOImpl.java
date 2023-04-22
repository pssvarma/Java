package com.microservices.micro.rest;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;





@Component
public class UserDAOImpl implements UserDAO<User> {

	ArrayList<User> list = new ArrayList<User>();

	@Override
	public Optional<User> get(Long id) {
	
		//return list.stream().filter(u->u.getId().equals(id)).findFirst();
		Optional<User> user=list.stream().filter(u->u.getId()==id).findFirst();
		
		 return user;
	}

	

	@Override
	public List<User> getAll() {
		
		  return new ArrayList<>(list);
	}
	@Override
	public User save(User t) {
		list.add(t);
	
		return t;
	}

	@Override
	public User update(User t) {
	
		int index=list.indexOf(t);
		
		if(index>0) {
			
			list.set(index, t);
			
			return t;
		}
		
		
		return null;
	}

	

	
	
	
	@Override
	public boolean delete(User t) {
		
    return list.remove(t);
	}
	
	
	
}