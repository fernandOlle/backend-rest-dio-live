package com.dio.live.controller;

import com.dio.live.model.NivelAcesso;
import com.dio.live.service.NivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nivel")
public class NivelController {
    @Autowired
    private NivelService nivelService;

    @PostMapping("/create")
    public NivelAcesso saveNivel(@RequestBody NivelAcesso NivelAcesso) {
        return nivelService.saveNivel(NivelAcesso);
    }

    @PutMapping("/update")
    public NivelAcesso updateNivel(@RequestBody NivelAcesso NivelAcesso) {
        return nivelService.updateNivel(NivelAcesso);
    }

    @GetMapping("/readall")
    public List<NivelAcesso> getListaNivel() {
        return nivelService.findAllNivels();
    }

    @GetMapping("/read/{idNivel}")
    public ResponseEntity<NivelAcesso> getNivelById(@PathVariable("idNivel") Long idNivel)
            throws Exception {
        return ResponseEntity.ok(
                nivelService.getNivelById(idNivel).orElseThrow(
                        () -> new Exception("Nivel não encontrada! - 404 -"))
        );
    }

    @DeleteMapping("/delete/{idNivel}")
    public void deleteNivelById(@PathVariable("idNivel") Long idNivel) {
        try {
            nivelService.deleteNivelById(idNivel);
        } catch (Exception exception) {
            System.out.println("Nivel não encontrada! - 404 - ");
        }
    }
}
