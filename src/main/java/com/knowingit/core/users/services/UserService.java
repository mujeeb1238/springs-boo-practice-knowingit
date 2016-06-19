package com.knowingit.core.users.services;

import java.util.Collection;
import java.util.Optional;

import com.knowingit.core.users.domain.User;
import com.knowingit.core.users.domain.UserCreateForm;

public interface UserService {

	Optional<User> getUserById(long id);

	Optional<User> getUserByUsername(String email);

	Optional<User> getUserByEmail(String email);

	Collection<User> getAllUsers();

	User create(UserCreateForm form);
}
