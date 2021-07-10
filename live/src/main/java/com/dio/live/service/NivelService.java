package com.dio.live.service;

import com.dio.live.model.NivelAcesso;
import com.dio.live.repository.NivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelService {
    @Autowired
    NivelRepository nivelRepository;

    public NivelAcesso saveNivel(NivelAcesso nivelAcesso) {
         return nivelRepository.save(nivelAcesso);
    }

    public NivelAcesso updateNivel(NivelAcesso nivelAcesso) {
        return nivelRepository.save(nivelAcesso);
    }

    public List<NivelAcesso> findAllNivels() {
        return nivelRepository.findAll();
    }

    public Optional<NivelAcesso> getNivelById(Long idNivel) {
        return nivelRepository.findById(idNivel);
    }

    public void deleteNivelById(Long idNivel) {
        nivelRepository.deleteById(idNivel);
    }
}
