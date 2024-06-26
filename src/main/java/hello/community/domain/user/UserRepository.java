package hello.community.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long>{
    Users findByPhone(String phone);
    Users findByName(String name);
}
