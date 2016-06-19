package com.knowingit.core.users.domain;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {

    Optional<User> findOneByUsername(String email);

	Optional<User> findOneByEmail(String email);
}
