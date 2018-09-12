package com.hithesh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hithesh.entity.Defect;
@Repository
public interface DefectRepository extends JpaRepository<Defect, Integer>  {
}
