package com.hueklr.recruitservice.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hueklr.recruitservice.model.Requirement;


public interface RequirementRepo extends CrudRepository<Requirement, Long> {

    //@Query("SELECT a FROM Article a WHERE a.title=:title and a.category=:category")
    //List<Customer> fetchArticles(@Param("title") String title, @Param("category") String category);

}
