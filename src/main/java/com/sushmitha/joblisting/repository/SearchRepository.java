package com.sushmitha.joblisting.repository;
import com.sushmitha.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}