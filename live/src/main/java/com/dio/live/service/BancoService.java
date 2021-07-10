package com.dio.live.service;

import com.dio.live.model.BancoDeHoras;
import com.dio.live.model.BancoDeHoras.*;
import com.dio.live.repository.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BancoService {
    @Autowired
    BancoRepository bancoRepository;

    public BancoDeHoras saveBanco(BancoDeHoras banco) {
        return bancoRepository.save(banco);
    }

    public BancoDeHoras updateBanco(BancoDeHoras banco) {
        return bancoRepository.save(banco);
    }

    public List<BancoDeHoras> findAllBancos() {
        return bancoRepository.findAll();
    }

    public Optional<BancoDeHoras> getBancoById(BancoDeHorasId bancoDeHorasId) {
        return bancoRepository.findById(bancoDeHorasId);
    }

    public List<BancoDeHoras> findByIdUsuario(Long usuario) {
        return bancoRepository.findByIdUsuario(usuario);
    }

    public void deleteByIdBanco(Long movimento) {
        bancoRepository.deleteByidMovimento(movimento);
    }

    public void deleteByIdUsuario(Long usuario) {
        bancoRepository.deleteByIdUsuario(usuario);
    }

    public List<BancoDeHoras> getBancoById(Long movimento) {
        return bancoRepository.findByidMovimento(movimento);
    }

    public List<BancoDeHoras> findByIdBancoDeHoras(Long movimento) {
        return bancoRepository.findByIdBancoHoras(movimento);
    }

    public void deleteByIdBancoDeHoras(Long usuario) {
        bancoRepository.deleteByIdBancoHoras(usuario);
    }
}
