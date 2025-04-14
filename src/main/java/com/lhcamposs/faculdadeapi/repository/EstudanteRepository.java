package com.lhcamposs.faculdadeapi.repository;

import com.lhcamposs.faculdadeapi.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
}
