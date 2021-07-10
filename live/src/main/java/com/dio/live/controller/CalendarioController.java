package com.dio.live.controller;

import com.dio.live.model.Calendario;
import com.dio.live.service.CalendarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendario")
public class CalendarioController {
    @Autowired
    private CalendarioService calendarioService;

    @PostMapping("/create")
    public Calendario saveCalendario(@RequestBody Calendario calendario) {
        return calendarioService.saveCalendario(calendario);
    }

    @PutMapping("/update")
    public Calendario updateCalendario(@RequestBody Calendario calendario) {
        return calendarioService.updateCalendario(calendario);
    }

    @GetMapping("/readall")
    public List<Calendario> getListaCalendario() {
        return calendarioService.findAllCalendarios();
    }

    @GetMapping("/read/{idCalendario}")
    public ResponseEntity<Calendario> getCalendarioById(@PathVariable("idCalendario") Long idCalendario)
            throws Exception {
        return ResponseEntity.ok(
                calendarioService.getCalendarioById(idCalendario).orElseThrow(
                        () -> new Exception("Calendario não encontrada! - 404 -"))
        );
    }

    @DeleteMapping("/delete/{idCalendario}")
    public void deleteCalendarioById(@PathVariable("idCalendario") Long idCalendario) {
        try {
            calendarioService.deleteCalendarioById(idCalendario);
        } catch (Exception exception) {
            System.out.println("Calendario não encontrada! - 404 - ");
        }
    }
}
