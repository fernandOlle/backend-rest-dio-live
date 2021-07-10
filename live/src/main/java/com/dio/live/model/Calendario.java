package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Audited
@Entity
public class Calendario {
    @Id
    private Long id;
    private String descricao;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private TipoData tipoData;
    private LocalDateTime dataEspecial;
}
