package com.dio.live.service;

import com.dio.live.model.Usuario;
import com.dio.live.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository UsuarioRepository;

    public Usuario saveUsuario(Usuario usuario) {
         return UsuarioRepository.save(usuario);
    }

    public Usuario updateUsuario(Usuario usuario) {
        return UsuarioRepository.save(usuario);
    }

    public List<Usuario> findAllUsuarios() {
        return UsuarioRepository.findAll();
    }

    public Optional<Usuario> getUsuarioById(Long idUsuario) {
        return UsuarioRepository.findById(idUsuario);
    }

    public void deleteUsuarioById(Long idUsuario) {
        UsuarioRepository.deleteById(idUsuario);
    }
}
