package com.example.simple_board.post.db;

import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.Optional;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
    public Optional<PostEntity> findByIdAndStatusOrderByIdDesc(Long id, String status);
    
}
