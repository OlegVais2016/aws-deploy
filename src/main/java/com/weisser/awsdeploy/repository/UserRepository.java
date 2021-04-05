package com.weisser.awsdeploy.repository;

import com.weisser.awsdeploy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
