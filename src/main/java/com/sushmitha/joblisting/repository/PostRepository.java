package com.sushmitha.joblisting.repository;

import com.sushmitha.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
