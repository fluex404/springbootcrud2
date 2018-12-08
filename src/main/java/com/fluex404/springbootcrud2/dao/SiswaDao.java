package com.fluex404.springbootcrud2.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fluex404.springbootcrud2.model.Siswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiswaDao extends JpaRepository<Siswa, Integer> {
}
