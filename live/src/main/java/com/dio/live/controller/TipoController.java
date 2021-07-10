package com.dio.live.controller;

import com.dio.live.model.TipoData;
import com.dio.live.service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo")
public class TipoController {
    @Autowired
    private TipoService tipoService;

    @PostMapping("/create")
    public TipoData saveTipo(@RequestBody TipoData tipoData) {
        return tipoService.saveTipo(tipoData);
    }

    @PutMapping("/update")
    public TipoData updateTipo(@RequestBody TipoData tipoData) {
        return tipoService.updateTipo(tipoData);
    }

    @GetMapping("/readall")
    public List<TipoData> getListaTipo() {
        return tipoService.findAllTipos();
    }

    @GetMapping("/read/{idTipo}")
    public ResponseEntity<TipoData> getTipoById(@PathVariable("idTipo") Long idTipo)
            throws Exception {
        return ResponseEntity.ok(
                tipoService.getTipoById(idTipo).orElseThrow(
                        () -> new Exception("Tipo de Data não encontrada! - 404 -"))
        );
    }

    @DeleteMapping("/delete/{idTipo}")
    public void deleteTipoById(@PathVariable("idTipo") Long idTipo) {
        try {
            tipoService.deleteTipoById(idTipo);
        } catch (Exception exception) {
            System.out.println("Tipo de Data não encontrada! - 404 - ");
        }
    }
}
