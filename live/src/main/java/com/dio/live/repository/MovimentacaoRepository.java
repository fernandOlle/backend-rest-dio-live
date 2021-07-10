package com.dio.live.repository;

import com.dio.live.model.Movimentacao;
import com.dio.live.model.Movimentacao.MovimentacaoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, MovimentacaoId> {
    List<Movimentacao> findByidMovimento(Long movimento);

    List<Movimentacao> findByIdUsuario(Long usuario);

    void deleteByidMovimento(Long movimento);

    void deleteByIdUsuario(Long usuario);
}
