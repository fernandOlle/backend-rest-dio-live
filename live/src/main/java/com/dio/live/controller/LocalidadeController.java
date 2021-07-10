package com.dio.live.controller;

import com.dio.live.model.Localidade;
import com.dio.live.service.LocalidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/localidade")
public class LocalidadeController {
    @Autowired
    private LocalidadeService localidadeService;

    @PostMapping("/create")
    public Localidade saveLocalidade(@RequestBody Localidade localidade) {
        return localidadeService.saveLocalidade(localidade);
    }

    @PutMapping("/update")
    public Localidade updateLocalidade(@RequestBody Localidade localidade) {
        return localidadeService.updateLocalidade(localidade);
    }

    @GetMapping("/readall")
    public List<Localidade> getListaLocalidade() {
        return localidadeService.findAllLocalidades();
    }

    @GetMapping("/read/{idLocalidade}")
    public ResponseEntity<Localidade> getLocalidadeById(@PathVariable("idLocalidade") Long idLocalidade)
            throws Exception {
        return ResponseEntity.ok(
                localidadeService.getLocalidadeById(idLocalidade).orElseThrow(
                        () -> new Exception("Localidade de Data não encontrada! - 404 -"))
        );
    }

    @DeleteMapping("/delete/{idLocalidade}")
    public void deleteLocalidadeById(@PathVariable("idLocalidade") Long idLocalidade) {
        try {
            localidadeService.deleteLocalidadeById(idLocalidade);
        } catch (Exception exception) {
            System.out.println("Localidade de Data não encontrada! - 404 - ");
        }
    }
}
