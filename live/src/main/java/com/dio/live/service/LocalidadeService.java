package com.dio.live.service;

import com.dio.live.model.Localidade;
import com.dio.live.repository.LocalidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalidadeService {
    @Autowired
    LocalidadeRepository LocalidadeRepository;

    public Localidade saveLocalidade(Localidade localidade) {
         return LocalidadeRepository.save(localidade);
    }

    public Localidade updateLocalidade(Localidade localidade) {
        return LocalidadeRepository.save(localidade);
    }

    public List<Localidade> findAllLocalidades() {
        return LocalidadeRepository.findAll();
    }

    public Optional<Localidade> getLocalidadeById(Long idLocalidade) {
        return LocalidadeRepository.findById(idLocalidade);
    }

    public void deleteLocalidadeById(Long idLocalidade) {
        LocalidadeRepository.deleteById(idLocalidade);
    }
}
