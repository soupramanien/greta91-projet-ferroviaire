package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Desserte;
import com.example.demo.entity.Gare;

public interface GareRepository extends JpaRepository<Gare, Integer> {

}
