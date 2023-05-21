package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Desserte;
import com.example.demo.entity.Gare;
import com.example.demo.entity.Ligne;

public interface LigneRepository extends JpaRepository<Ligne, Integer> {

}
