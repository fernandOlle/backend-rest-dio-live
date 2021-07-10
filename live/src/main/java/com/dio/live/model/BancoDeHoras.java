package com.dio.live.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Entity
public class BancoDeHoras {


    @Embeddable
    @NoArgsConstructor
    @EqualsAndHashCode
    @AllArgsConstructor
    public class BancoDeHorasId implements Serializable {
        private Long movimento;
        private Long usuario;
        private Long bancoHoras;
    }

    @EmbeddedId
    private BancoDeHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;
}
