package com.microservices.micro.rest;

import java.util.List;
import java.util.Optional;

public interface UserDAO<T> {

	T get(Long id);

	List<T> getAll();

	T save(T t);

	T  update(T t);

	boolean delete(T t);	

}
