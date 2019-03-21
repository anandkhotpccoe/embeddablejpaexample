/**
 * 
 */
package com.embeddeble.embeddeble.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.embeddeble.embeddeble.model.User;

/**
 * @author anand
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
