package com.knowingit.core.users.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
	public Account findByUsername(String username);
}
