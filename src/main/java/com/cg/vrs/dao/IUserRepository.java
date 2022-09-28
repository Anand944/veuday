package com.cg.vrs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.cg.vrs.entities.User;


@Repository
public interface IUserRepository extends JpaRepository<User, Integer>{


}


