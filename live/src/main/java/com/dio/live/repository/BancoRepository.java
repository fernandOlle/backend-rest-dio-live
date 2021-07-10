package com.dio.live.repository;

import com.dio.live.model.BancoDeHoras;
import com.dio.live.model.BancoDeHoras.BancoDeHorasId;
import com.dio.live.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BancoRepository extends JpaRepository<BancoDeHoras, BancoDeHorasId> {
    List<BancoDeHoras> findByidMovimento(Long movimento);

    List<BancoDeHoras> findByIdUsuario(Long usuario);

    List<BancoDeHoras> findByIdBancoHoras(Long usuario);

    void deleteByidMovimento(Long movimento);

    void deleteByIdUsuario(Long usuario);

    void deleteByIdBancoHoras(Long banco);
}
