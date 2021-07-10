package com.dio.live.service;

import com.dio.live.model.JornadaDeTrabalho;
import com.dio.live.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {
    @Autowired
    JornadaRepository jornadaRepository;

    public JornadaDeTrabalho saveJornada(JornadaDeTrabalho jornadaDeTrabalho) {
         return jornadaRepository.save(jornadaDeTrabalho);
    }

    public JornadaDeTrabalho updateJornada(JornadaDeTrabalho jornadaDeTrabalho) {
        return jornadaRepository.save(jornadaDeTrabalho);
    }

    public List<JornadaDeTrabalho> findAllJornadas() {
        return jornadaRepository.findAll();
    }

    public Optional<JornadaDeTrabalho> getJornadaById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public void deleteJornadaById(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
}
