package com.example.prj_ac1_atv2.repository;

import com.example.prj_ac1_atv2.entity.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * FuncionarioRepository
 */
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    
}