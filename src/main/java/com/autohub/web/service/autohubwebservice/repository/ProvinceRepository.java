package com.autohub.web.service.autohubwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autohub.web.service.autohubwebservice.entity.ProvinceEntity;

@Repository
public interface ProvinceRepository extends JpaRepository<ProvinceEntity,Integer> {
    
}
