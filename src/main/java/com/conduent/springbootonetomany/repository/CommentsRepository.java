package com.conduent.springbootonetomany.repository;

import com.conduent.springbootonetomany.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository <Comments, Integer> {
}
