package com.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.model.Blogpost;

public interface BlogpostRepository extends JpaRepository<Blogpost, Long> {

}
