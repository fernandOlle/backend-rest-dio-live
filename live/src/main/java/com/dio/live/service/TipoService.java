package com.dio.live.service;

import com.dio.live.model.TipoData;
import com.dio.live.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoService {
    @Autowired
    TipoRepository tipoRepository;

    public TipoData saveTipo(TipoData tipoData) {
         return tipoRepository.save(tipoData);
    }

    public TipoData updateTipo(TipoData tipoData) {
        return tipoRepository.save(tipoData);
    }

    public List<TipoData> findAllTipos() {
        return tipoRepository.findAll();
    }

    public Optional<TipoData> getTipoById(Long idTipo) {
        return tipoRepository.findById(idTipo);
    }

    public void deleteTipoById(Long idTipo) {
        tipoRepository.deleteById(idTipo);
    }
}
