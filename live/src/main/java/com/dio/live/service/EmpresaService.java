package com.dio.live.service;

import com.dio.live.model.Empresa;
import com.dio.live.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa saveEmpresa(Empresa empresa) {
         return empresaRepository.save(empresa);
    }

    public Empresa updateEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public List<Empresa> findAllEmpresas() {
        return empresaRepository.findAll();
    }

    public Optional<Empresa> getEmpresaById(Long idEmpresa) {
        return empresaRepository.findById(idEmpresa);
    }

    public void deleteEmpresaById(Long idEmpresa) {
        empresaRepository.deleteById(idEmpresa);
    }
}
