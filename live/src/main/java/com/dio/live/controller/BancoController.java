package com.dio.live.controller;

import com.dio.live.model.BancoDeHoras;
import com.dio.live.service.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banco")
public class BancoController {
    @Autowired
    private BancoService bancoService;

    @PostMapping("/create")
    public BancoDeHoras saveBancoDeHoras(@RequestBody BancoDeHoras bancoDeHoras) {
        return bancoService.saveBanco(bancoDeHoras);
    }

    @PutMapping("/update")
    public BancoDeHoras updateBancoDeHoras(@RequestBody BancoDeHoras bancoDeHoras) {
        return bancoService.updateBanco(bancoDeHoras);
    }

    @GetMapping("/readall")
    public List<BancoDeHoras> getListaBancoDeHoras() {
        return bancoService.findAllBancos();
    }

    @GetMapping("/readMove/{idBancoDeHoras}")
    public List<BancoDeHoras> getBancoDeHorasByIdMove(@PathVariable("idBancoDeHoras") Long idBancoDeHoras) {
        return
                bancoService.findByIdBancoDeHoras(idBancoDeHoras).isEmpty() ?
                        null :
                        bancoService.findByIdUsuario(idBancoDeHoras);
    }

    @DeleteMapping("/deleteMove/{idBancoDeHoras}")
    public void deleteBancoDeHorasById(@PathVariable("idBancoDeHoras") Long idBancoDeHoras) {
        try {
            bancoService.deleteByIdBanco(idBancoDeHoras);
        } catch (Exception exception) {
            System.out.println("BancoDeHoras  não encontrada! - 404 - ");
        }
    }

    @GetMapping("/readUser/{idBancoDeHoras}")
    public List<BancoDeHoras> getBancoDeHorasByIdUser(@PathVariable("idBancoDeHoras") Long idBancoDeHoras) {
        return
                bancoService.findByIdUsuario(idBancoDeHoras).isEmpty() ?
                        null :
                        bancoService.findByIdUsuario(idBancoDeHoras);

    }

    @DeleteMapping("/deleteUser/{idBancoDeHoras}")
    public void deleteUsusarioById(@PathVariable("idBancoDeHoras") Long idBancoDeHoras) {
        try {
            bancoService.deleteByIdUsuario(idBancoDeHoras);
        } catch (Exception exception) {
            System.out.println("BancoDeHoras  não encontrada! - 404 - ");
        }
    }

    @GetMapping("/readBanco/{idBancoDeHoras}")
    public List<BancoDeHoras> getBancoDeHorasByIdBanco(@PathVariable("idBancoDeHoras") Long idBancoDeHoras) {
        return
                bancoService.findByIdBancoDeHoras(idBancoDeHoras).isEmpty() ?
                        null :
                        bancoService.findByIdBancoDeHoras(idBancoDeHoras);

    }

    @DeleteMapping("/deleteBanco/{idBancoDeHoras}")
    public void deleteUsusarioByBanco(@PathVariable("idBancoDeHoras") Long idBancoDeHoras) {
        try {
            bancoService.deleteByIdBancoDeHoras(idBancoDeHoras);
        } catch (Exception exception) {
            System.out.println("BancoDeHoras  não encontrada! - 404 - ");
        }
    }

}
