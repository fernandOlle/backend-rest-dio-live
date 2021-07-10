package com.dio.live.service;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public CategoriaUsuario saveCategoria(CategoriaUsuario categoriaUsuario) {
         return categoriaRepository.save(categoriaUsuario);
    }

    public CategoriaUsuario updateCategoria(CategoriaUsuario categoriaUsuario) {
        return categoriaRepository.save(categoriaUsuario);
    }

    public List<CategoriaUsuario> findAllCategorias() {
        return categoriaRepository.findAll();
    }

    public Optional<CategoriaUsuario> getCategoriaById(Long idCategoria) {
        return categoriaRepository.findById(idCategoria);
    }

    public void deleteCategoriaById(Long idCategoria) {
        categoriaRepository.deleteById(idCategoria);
    }
}
