package com.alumnos.alumnos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/materias")
public class MateriasController {
    
    @GetMapping
    public String getAlumno(){
        return "MATERIAS EVALUADAS";
    }

}




