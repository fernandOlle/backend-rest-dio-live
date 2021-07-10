package com.dio.live.controller;

import com.dio.live.model.Usuario;
import com.dio.live.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/create")
    public Usuario saveUsuario(@RequestBody Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }

    @PutMapping("/update")
    public Usuario updateUsuario(@RequestBody Usuario usuario) {
        return usuarioService.updateUsuario(usuario);
    }

    @GetMapping("/readall")
    public List<Usuario> getListaUsuario() {
        return usuarioService.findAllUsuarios();
    }

    @GetMapping("/read/{idUsuario}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("idUsuario") Long idUsuario)
            throws Exception {
        return ResponseEntity.ok(
                usuarioService.getUsuarioById(idUsuario).orElseThrow(
                        () -> new Exception("Usuario não encontrada! - 404 -"))
        );
    }

    @DeleteMapping("/delete/{idUsuario}")
    public void deleteUsuarioById(@PathVariable("idUsuario") Long idUsuario) {
        try {
            usuarioService.deleteUsuarioById(idUsuario);
        } catch (Exception exception) {
            System.out.println("Usuario não encontrada! - 404 - ");
        }
    }
}
