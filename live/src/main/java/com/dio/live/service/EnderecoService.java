package com.dio.live.service;

import com.dio.live.model.Endereco;
import com.dio.live.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    @Autowired
    EnderecoRepository enderecoRepository;

    public Endereco saveEndereco(Endereco endereco) {
         return enderecoRepository.save(endereco);
    }

    public Endereco updateEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> findAllEnderecos() {
        return enderecoRepository.findAll();
    }

    public Optional<Endereco> getEnderecoById(Long idEndereco) {
        return enderecoRepository.findById(idEndereco);
    }

    public void deleteEnderecoById(Long idEndereco) {
        enderecoRepository.deleteById(idEndereco);
    }
}
