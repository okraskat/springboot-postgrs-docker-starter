package com.okraskat.springbootpostgresqldocker.repository;

import com.okraskat.springbootpostgresqldocker.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<UserModel, Long> {
}
