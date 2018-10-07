package com.hueklr.recruitservice.repo;

import org.springframework.data.repository.CrudRepository;

import com.hueklr.recruitservice.model.RequirementJd;


public interface RequirementJdRepo extends CrudRepository<RequirementJd, Long> {

	//@Query("SELECT a FROM Article a WHERE a.title=:title and a.category=:category")
    //List<Customer> fetchArticles(@Param("title") String title, @Param("category") String category);

}
