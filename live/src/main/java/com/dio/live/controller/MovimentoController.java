package com.dio.live.controller;

import com.dio.live.model.Movimentacao;
import com.dio.live.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimentacao")
public class MovimentoController {
    @Autowired
    private MovimentacaoService movimentacaoService;

    @PostMapping("/create")
    public Movimentacao saveMovimentacao(@RequestBody Movimentacao Movimentacao) {
        return movimentacaoService.saveMovimentacao(Movimentacao);
    }

    @PutMapping("/update")
    public Movimentacao updateMovimentacao(@RequestBody Movimentacao Movimentacao) {
        return movimentacaoService.updateMovimentacao(Movimentacao);
    }

    @GetMapping("/readall")
    public List<Movimentacao> getListaMovimentacao() {
        return movimentacaoService.findAllMovimentacaos();
    }

    @GetMapping("/readMove/{idMovimentacao}")
    public List<Movimentacao> getMovimentacaoByIdMove(@PathVariable("idMovimentacao") Long idMovimentacao) {
        return
                movimentacaoService.getMovimentacaoById(idMovimentacao).isEmpty() ?
                        null :
                        movimentacaoService.findByIdUsuario(idMovimentacao);
    }

    @DeleteMapping("/deleteMove/{idMovimentacao}")
    public void deleteMovimentacaoById(@PathVariable("idMovimentacao") Long idMovimentacao) {
        try {
            movimentacaoService.deleteByIdMovimentacao(idMovimentacao);
        } catch (Exception exception) {
            System.out.println("Movimentacao  não encontrada! - 404 - ");
        }
    }

    @GetMapping("/readUser/{idMovimentacao}")
    public List<Movimentacao> getMovimentacaoByIdUser(@PathVariable("idMovimentacao") Long idMovimentacao) {
        return
                movimentacaoService.findByIdUsuario(idMovimentacao).isEmpty() ?
                        null :
                        movimentacaoService.findByIdUsuario(idMovimentacao);

    }

    @DeleteMapping("/deleteUser/{idMovimentacao}")
    public void deleteUsusarioById(@PathVariable("idMovimentacao") Long idMovimentacao) {
        try {
            movimentacaoService.deleteByIdUsuario(idMovimentacao);
        } catch (Exception exception) {
            System.out.println("Movimentacao  não encontrada! - 404 - ");
        }
    }

}
