package com.dio.live.controller;

import com.dio.live.model.Ocorrencia;
import com.dio.live.service.OcorrenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ocorrencia")
public class OcorrenciaController {
    @Autowired
    private OcorrenciaService ocorrenciaService;

    @PostMapping("/create")
    public Ocorrencia saveOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.saveOcorrencia(ocorrencia);
    }

    @PutMapping("/update")
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia) {
        return ocorrenciaService.updateOcorrencia(ocorrencia);
    }

    @GetMapping("/readall")
    public List<Ocorrencia> getListaOcorrencia() {
        return ocorrenciaService.findAllOcorrencias();
    }

    @GetMapping("/read/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> getOcorrenciaById(@PathVariable("idOcorrencia") Long idOcorrencia)
            throws Exception {
        return ResponseEntity.ok(
                ocorrenciaService.getOcorrenciaById(idOcorrencia).orElseThrow(
                        () -> new Exception("Ocorrencia não encontrada! - 404 -"))
        );
    }

    @DeleteMapping("/delete/{idOcorrencia}")
    public void deleteOcorrenciaById(@PathVariable("idOcorrencia") Long idOcorrencia) {
        try {
            ocorrenciaService.deleteOcorrenciaById(idOcorrencia);
        } catch (Exception exception) {
            System.out.println("Ocorrencia  não encontrada! - 404 - ");
        }
    }
}
