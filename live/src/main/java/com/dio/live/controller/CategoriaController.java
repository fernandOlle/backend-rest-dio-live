package com.dio.live.controller;

import com.dio.live.model.CategoriaUsuario;
import com.dio.live.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/create")
    public CategoriaUsuario saveCategoria(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaService.saveCategoria(categoriaUsuario);
    }

    @PutMapping("/update")
    public CategoriaUsuario updateCategoria(@RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaService.updateCategoria(categoriaUsuario);
    }

    @GetMapping("/readall")
    public List<CategoriaUsuario> getListaCategoria() {
        return categoriaService.findAllCategorias();
    }

    @GetMapping("/read/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> getCategoriaById(@PathVariable("idCategoria") Long idCategoria)
            throws Exception {
        return ResponseEntity.ok(
                categoriaService.getCategoriaById(idCategoria).orElseThrow(
                        () -> new Exception("Categoria de Usuário não encontrada! - 404 -"))
        );
    }

    @DeleteMapping("/delete/{idCategoria}")
    public void deleteCategoriaById(@PathVariable("idCategoria") Long idCategoria) {
        try {
            categoriaService.deleteCategoriaById(idCategoria);
        } catch (Exception exception) {
            System.out.println("Categoria de Usuário não encontrada! - 404 - ");
        }
    }
}
