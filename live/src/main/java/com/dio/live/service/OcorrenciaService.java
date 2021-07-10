package com.dio.live.service;

import com.dio.live.model.Ocorrencia;
import com.dio.live.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OcorrenciaService {
    @Autowired
    OcorrenciaRepository ocorrenciaRepository;

    public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia) {
         return ocorrenciaRepository.save(ocorrencia);
    }

    public Ocorrencia updateOcorrencia(Ocorrencia ocorrencia) {
        return ocorrenciaRepository.save(ocorrencia);
    }

    public List<Ocorrencia> findAllOcorrencias() {
        return ocorrenciaRepository.findAll();
    }

    public Optional<Ocorrencia> getOcorrenciaById(Long idOcorrencia) {
        return ocorrenciaRepository.findById(idOcorrencia);
    }

    public void deleteOcorrenciaById(Long idOcorrencia) {
        ocorrenciaRepository.deleteById(idOcorrencia);
    }
}
