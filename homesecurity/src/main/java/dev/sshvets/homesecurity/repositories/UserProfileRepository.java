package dev.sshvets.homesecurity.repositories;

import dev.sshvets.homesecurity.entities.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    UserProfile findByUserUsername(String username);
}
