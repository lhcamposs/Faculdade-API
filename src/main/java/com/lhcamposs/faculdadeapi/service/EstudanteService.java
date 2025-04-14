package com.lhcamposs.faculdadeapi.service;

import com.lhcamposs.faculdadeapi.model.Estudante;
import com.lhcamposs.faculdadeapi.repository.EstudanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class EstudanteService {

    private final EstudanteRepository estudanteRepository;

    @Transactional
    public Estudante salvar(Estudante estudante){
        return estudanteRepository.save(estudante);
    }

}
