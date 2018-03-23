package com.cherub.cherub.user.repository;

import com.cherub.cherub.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.CriteriaBuilder;

@Component
public interface UserRepository extends JpaRepository<User,CriteriaBuilder.In> {

}
