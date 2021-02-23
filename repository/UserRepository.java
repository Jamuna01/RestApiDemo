package com.vastika.userinfosystem.repository;

import com.vastika.userinfosystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
