package com.work.netflixapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work.netflixapp.netflix_codes;

@Repository
public interface NetflixCodesDAO extends JpaRepository<netflix_codes,Integer> {
    
}
