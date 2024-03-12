package com.monitoring.api.objects;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TotalPeriodoDTO {

	private Map<String, List<MarcacaoVinculoInicioFimVO>> marcacaoListTotalPeriodo = new TreeMap<>();
	private Map<String, String> totalPeriodo = new TreeMap<>();
	private Map<String, String> horasNoturnasCLT = new TreeMap<>();

	public Map<String, List<MarcacaoVinculoInicioFimVO>> getMarcacaoListTotalPeriodo() {
		return marcacaoListTotalPeriodo;
	}

	public void setMarcacaoListTotalPeriodo(Map<String, List<MarcacaoVinculoInicioFimVO>> marcacaoListTotalPeriodo) {
		this.marcacaoListTotalPeriodo = marcacaoListTotalPeriodo;
	}

	public Map<String, String> getTotalPeriodo() {
		return totalPeriodo;
	}

	public void setTotalPeriodo(Map<String, String> totalPeriodo) {
		this.totalPeriodo = totalPeriodo;
	}

	public Map<String, String> getHorasNoturnasCLT() {
		return horasNoturnasCLT;
	}

	public void setHorasNoturnasCLT(Map<String, String> horasNoturnasCLT) {
		this.horasNoturnasCLT = horasNoturnasCLT;
	}
}
