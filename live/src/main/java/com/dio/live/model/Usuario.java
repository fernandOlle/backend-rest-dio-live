package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Audited
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Empresa empresa;
    private BigDecimal tolerancia;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private NivelAcesso nivelAcesso;
    private LocalDateTime finalJornada;
    private LocalDateTime inicioJornada;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private CategoriaUsuario categoriaUsuario;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private JornadaDeTrabalho jornadaDeTrabalho;
}
