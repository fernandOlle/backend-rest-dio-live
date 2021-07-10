package com.dio.live.service;

import com.dio.live.model.Movimentacao;
import com.dio.live.model.Movimentacao.*;
import com.dio.live.repository.MovimentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimentacaoService {
    @Autowired
    MovimentacaoRepository movimentacaoRepository;

    public Movimentacao saveMovimentacao(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao updateMovimentacao(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public List<Movimentacao> findAllMovimentacaos() {
        return movimentacaoRepository.findAll();
    }

    public Optional<Movimentacao> getMovimentacaoById(MovimentacaoId movimentacaoId) {
        return movimentacaoRepository.findById(movimentacaoId);
    }

    public List<Movimentacao>  findByIdUsuario(Long usuario) {
        return movimentacaoRepository.findByIdUsuario(usuario);
    }

    public void deleteByIdMovimentacao(Long movimento) {
        movimentacaoRepository.deleteByidMovimento(movimento);
    }

    public void deleteByIdUsuario(Long usuario) {
        movimentacaoRepository.deleteByIdUsuario(usuario);
    }

    public List<Movimentacao>  getMovimentacaoById(Long movimento) {
        return movimentacaoRepository.findByidMovimento(movimento);
    }
}
