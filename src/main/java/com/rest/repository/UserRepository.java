package com.rest.repository;

import com.rest.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author y.skuratovich
 * @since 08.07.2016
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
