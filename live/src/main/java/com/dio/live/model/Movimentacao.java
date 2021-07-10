package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Audited
@Entity
public class Movimentacao {

    @Getter
    @Setter
    @Embeddable
    @NoArgsConstructor
    @EqualsAndHashCode
    @AllArgsConstructor
    public class MovimentacaoId implements Serializable {
        private Long movimento;
        private Long usuario;
    }

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime saidaEntrada;
    private BigDecimal periodo;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Ocorrencia ocorrencia;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Calendario calendario;
}
