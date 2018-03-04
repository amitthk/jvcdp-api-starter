package com.jvcdp.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jvcdp.model.Blogpost;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogpostRepository extends JpaRepository<Blogpost, Long> {

    @Query("select count(e) from Blogpost e")
    int countBlogposts();

    @Query("select count(e) FROM Blogpost e where e.category=:category")
    int countBlogpostsByCategory(@Param("category")String category);


    @Query("select e FROM Blogpost e where e.category=:category")
    List<Blogpost> getBlogpostsByCategory(@Param("category")String category);
}
