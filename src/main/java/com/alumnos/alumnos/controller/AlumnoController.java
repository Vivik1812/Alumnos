package com.alumnos.alumnos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/alumnos")
public class AlumnoController {

    @GetMapping
    public String getAlumno(){
        return "ALUMNOS Y SUS NOTAS!!!";
    }
}
