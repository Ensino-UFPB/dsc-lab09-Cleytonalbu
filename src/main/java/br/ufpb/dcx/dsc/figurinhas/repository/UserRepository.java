package br.ufpb.dcx.dsc.figurinhas.repository;

import br.ufpb.dcx.dsc.figurinhas.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}