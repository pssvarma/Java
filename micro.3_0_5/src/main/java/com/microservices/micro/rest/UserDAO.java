package com.microservices.micro.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
@Component
public interface UserDAO<T> {

	Optional<T> get(Long id);

	List<T> getAll();

	T save(T t);

	T  update(T t);

	boolean delete(T t);	

}
