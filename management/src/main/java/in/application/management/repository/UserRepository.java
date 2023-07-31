package in.application.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.application.management.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	Object findAllById(Long id);

	
}
