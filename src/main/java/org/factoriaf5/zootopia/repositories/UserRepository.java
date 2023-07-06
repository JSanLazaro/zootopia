package org.factoriaf5.zootopia.repositories;

import org.factoriaf5.zootopia.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long>{
    @Query("SELECT u FROM User u WHERE u.name = ?1")
    User findByName(String name);
}
