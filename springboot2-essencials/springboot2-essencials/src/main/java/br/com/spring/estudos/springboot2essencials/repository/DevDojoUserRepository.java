package br.com.spring.estudos.springboot2essencials.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.estudos.springboot2essencials.domain.DevDojoUser;

public interface DevDojoUserRepository extends JpaRepository<DevDojoUser, Long> {

    DevDojoUser findByUsername(String username);
}
