package com.monitoring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.monitoring.api.model.MarcacaoVinculoInicioFim;
import com.monitoring.api.objects.MarcacaoVinculoInicioFimVO;

import java.time.OffsetDateTime;
import java.util.List;

@Repository
public interface MarcacaoVinculoInicioFimRepository extends JpaRepository<MarcacaoVinculoInicioFim, Long> {
        @Query("SELECT new com.monitoring.api.objects.MarcacaoVinculoInicioFimVO(mt.codigo, mt.nome, c.nome, cast(date_trunc('day', mi.dataHoraMarcacao) as date) as dia, "
                        +
                        "mi.dataHoraMarcacao as dataHoraMarcacaoInicio, " +
                        "mf.dataHoraMarcacao as dataHoraMarcacaoFim) " +
                        "FROM MarcacaoVinculoInicioFim mvi " +
                        "JOIN mvi.marcacaoInicio mi " +
                        "JOIN mvi.marcacaoFim mf " +
                        "JOIN mi.marcacaoTipo mt " +
                        "JOIN mi.colaborador c " +
                        "WHERE c.cpf = :cpf " +
                        "AND mi.dataHoraMarcacao BETWEEN :dataInicial AND :dataFinal " +
                        "GROUP BY mt.codigo, c.nome, dia, mi.dataHoraMarcacao, mf.dataHoraMarcacao " +
                        "ORDER BY dia")
        List<MarcacaoVinculoInicioFimVO> findAllGroupedByDia(@Param("cpf") String cpf,
                        @Param("dataInicial") OffsetDateTime dataInicial,
                        @Param("dataFinal") OffsetDateTime dataFinal);
}