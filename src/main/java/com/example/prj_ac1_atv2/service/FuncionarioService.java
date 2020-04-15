package com.example.prj_ac1_atv2.service;

import com.example.prj_ac1_atv2.repository.FuncionarioRepository;

import java.util.List;

import com.example.prj_ac1_atv2.entity.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FuncionarioService
 */
@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repos;

    public List<Funcionario> getAll(){
        return repos.findAll();
    }

    public boolean setFuncionario(Funcionario f){
        if(f.getNome().isEmpty() || f.getCpf().isEmpty()|| f.getSobrenome().isEmpty() || f.getSalario() <= 0)
            return false;
        repos.save(f);
        return true;
    }
}