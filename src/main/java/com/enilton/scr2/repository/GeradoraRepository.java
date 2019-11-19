package com.enilton.scr2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enilton.scr2.models.Geradora;

@Repository
public interface GeradoraRepository extends JpaRepository<Geradora, Long> {
	
} 