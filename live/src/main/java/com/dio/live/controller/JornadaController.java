package com.dio.live.controller;

import com.dio.live.model.JornadaDeTrabalho;
import com.dio.live.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornada")
public class JornadaController {
    @Autowired
    private JornadaService jornadaService;

    @PostMapping("/create")
    public JornadaDeTrabalho saveJornada(@RequestBody JornadaDeTrabalho jornadaDeTrabalho) {
        return jornadaService.saveJornada(jornadaDeTrabalho);
    }

    @PutMapping("/update")
    public JornadaDeTrabalho updateJornada(@RequestBody JornadaDeTrabalho jornadaTrabalho) {
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @GetMapping("/readall")
    public List<JornadaDeTrabalho> getListaJornada() {
        return jornadaService.findAllJornadas();
    }

    @GetMapping("/read/{idJornada}")
    public ResponseEntity<JornadaDeTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada)
            throws Exception {
        return ResponseEntity.ok(
                jornadaService.getJornadaById(idJornada).orElseThrow(
                        () -> new Exception("Jornada de Trabalho não encontrada! - 404 -"))
        );
    }

    @DeleteMapping("/delete/{idJornada}")
    public void deleteJornadaById(@PathVariable("idJornada") Long idJornada) {
        try {
            jornadaService.deleteJornadaById(idJornada);
        } catch (Exception exception) {
            System.out.println("Jornada de Trabalho não encontrada! - 404 - ");
        }
    }
}
