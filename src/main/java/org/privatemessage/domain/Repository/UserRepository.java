package org.privatemessage.domain.Repository;

import org.privatemessage.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
