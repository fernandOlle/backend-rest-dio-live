package com.dio.live.controller;

import com.dio.live.model.Endereco;
import com.dio.live.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/create")
    public Endereco saveEndereco(@RequestBody Endereco endereco) {
        return enderecoService.saveEndereco(endereco);
    }

    @PutMapping("/update")
    public Endereco updateEndereco(@RequestBody Endereco endereco) {
        return enderecoService.updateEndereco(endereco);
    }

    @GetMapping("/readall")
    public List<Endereco> getListaEndereco() {
        return enderecoService.findAllEnderecos();
    }

    @GetMapping("/read/{idEndereco}")
    public ResponseEntity<Endereco> getEnderecoById(@PathVariable("idEndereco") Long idEndereco)
            throws Exception {
        return ResponseEntity.ok(
                enderecoService.getEnderecoById(idEndereco).orElseThrow(
                        () -> new Exception("Endereco não encontrada! - 404 -"))
        );
    }

    @DeleteMapping("/delete/{idEndereco}")
    public void deleteEnderecoById(@PathVariable("idEndereco") Long idEndereco) {
        try {
            enderecoService.deleteEnderecoById(idEndereco);
        } catch (Exception exception) {
            System.out.println("Endereco não encontrada! - 404 - ");
        }
    }
}
