package com.microservices.micro.UserTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.microservices.micro.rest.User;
import com.microservices.micro.rest.UserDAO;
import com.microservices.micro.rest.UserDAOImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserDAOImplTest {

	@Mock
	private UserDAO<User> userRepository;

	@InjectMocks
	private UserDAOImpl userDAOImpl;

	@BeforeEach
	public void initMocks() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testGet() {
		// Arrange
		User user = new User();
		user.setId(1L);
		when(userRepository.get(1L)).thenReturn(user);

		// Act
		User actualUser = userDAOImpl.get(1L);

		// Assert
		assertEquals(user, actualUser);
	}

	@Test
	public void testGetAll() {
		// Arrange
		List<User> users = new ArrayList<User>();
		users.add(new User());
		users.add(new User());
		when(userRepository.getAll()).thenReturn(users);

		// Act
		List<User> actualUsers = userDAOImpl.getAll();

		// Assert
		assertEquals(users, actualUsers);
	}

	@Test
	public void testSave() {
		// Arrange
		User user = new User();
		user.setId(1L);
		when(userRepository.save(user)).thenReturn(user);

		// Act
		User actualUser = userDAOImpl.save(user);

		// Assert
		assertEquals(user, actualUser);
	}

	@Test
	public void testUpdate() {
		// Arrange
		User user = new User();
		user.setId(1L);
		when(userRepository.update(user)).thenReturn(user);

		// Act
		User actualUser = userDAOImpl.update(user);

		// Assert
		assertEquals(user, actualUser);
	}

	@Test
	public void testDelete() {
		// Arrange
		User user = new User();
		user.setId(1L);
		when(userRepository.delete(user)).thenReturn(true);

		// Act
		boolean actualResult = userDAOImpl.delete(user);

		// Assert
		assertTrue(actualResult);
	}
}
