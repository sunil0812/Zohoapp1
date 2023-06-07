package com.Zohoapp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Zohoapp1.entity.Lead;

public interface Leadrepository extends JpaRepository<Lead, Long> {

}
