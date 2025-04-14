package com.lhcamposs.faculdadeapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "estudantes")
public class Estudante implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "primeiro_nome", nullable = false, length = 50)
    private String primeiroNome;
    @Column(name = "segundo_nome", nullable = false, length = 50)
    private String segundoNome;
    @Column(name = "endereco", nullable = false, length = 200)
    private String endereco;
    @Column(name = "genero", nullable = false, length = 20)
    private String genero;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudante estudante = (Estudante) o;
        return Objects.equals(id, estudante.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
