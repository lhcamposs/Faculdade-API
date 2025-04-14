package com.lhcamposs.faculdadeapi.controller;

import com.lhcamposs.faculdadeapi.model.Estudante;
import com.lhcamposs.faculdadeapi.service.EstudanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/estudantes")
public class EstudanteController {

    private final EstudanteService estudanteService;

    @PostMapping
    public ResponseEntity<Estudante> create(@RequestBody Estudante estudante){
        Estudante student = estudanteService.salvar(estudante);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

}
