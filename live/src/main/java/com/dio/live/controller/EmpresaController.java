package com.dio.live.controller;

import com.dio.live.model.Empresa;
import com.dio.live.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;

    @PostMapping("/create")
    public Empresa saveEmpresa(@RequestBody Empresa empresa) {
        return empresaService.saveEmpresa(empresa);
    }

    @PutMapping("/update")
    public Empresa updateEmpresa(@RequestBody Empresa empresa) {
        return empresaService.updateEmpresa(empresa);
    }

    @GetMapping("/readall")
    public List<Empresa> getListaEmpresa() {
        return empresaService.findAllEmpresas();
    }

    @GetMapping("/read/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaById(@PathVariable("idEmpresa") Long idEmpresa)
            throws Exception {
        return ResponseEntity.ok(
                empresaService.getEmpresaById(idEmpresa).orElseThrow(
                        () -> new Exception("Empresa não encontrada! - 404 -"))
        );
    }

    @DeleteMapping("/delete/{idEmpresa}")
    public void deleteEmpresaById(@PathVariable("idEmpresa") Long idEmpresa) {
        try {
            empresaService.deleteEmpresaById(idEmpresa);
        } catch (Exception exception) {
            System.out.println("Empresa não encontrada! - 404 - ");
        }
    }
}
