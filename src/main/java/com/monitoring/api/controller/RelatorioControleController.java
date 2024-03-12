package com.monitoring.api.controller;

import java.time.OffsetDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monitoring.api.objects.PeriodoDTO;
import com.monitoring.api.objects.TotalPeriodoDTO;
import com.monitoring.api.service.MarcacaoVinculoInicioFimService;

@RestController
public class RelatorioControleController {

    @Autowired
    private MarcacaoVinculoInicioFimService marcacaoVinculoInicioFimService;

    @PostMapping(path = "/relatorio/{cpf}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public TotalPeriodoDTO consultaTotalPeriodo(@PathVariable String cpf, @RequestBody PeriodoDTO periodoDTO) {
        OffsetDateTime dataInicial = periodoDTO.getDataInicial();
        OffsetDateTime dataFinal = periodoDTO.getDataFinal();
        return marcacaoVinculoInicioFimService.listaTotalPeriodo(cpf, dataInicial, dataFinal);
    }
}