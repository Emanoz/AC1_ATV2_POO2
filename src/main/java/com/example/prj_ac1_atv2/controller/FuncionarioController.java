package com.example.prj_ac1_atv2.controller;

import java.util.List;

import com.example.prj_ac1_atv2.entity.Funcionario;
import com.example.prj_ac1_atv2.service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;    

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService serv;

    @GetMapping("/funcionarios")
    public ModelAndView getAll(){
        List<Funcionario> list = serv.getAll();
        ModelAndView mv = new ModelAndView("viewFuncionarios");
        mv.addObject("list", list);
        
        return mv;
    }

    @PostMapping("/funcionarios")
    public ModelAndView setFuncionario(@ModelAttribute Funcionario f){
        ModelAndView mv = new ModelAndView();
        
        if(!serv.setFuncionario(f))
            mv.setViewName("viewErroNull");
        else{
            List<Funcionario> list = serv.getAll();
            mv.addObject("list", list);
            mv.setViewName("viewFuncionarios");
        }
            
        return mv;
    }
}