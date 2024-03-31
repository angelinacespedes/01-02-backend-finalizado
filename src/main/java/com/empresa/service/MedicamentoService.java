package com.empresa.service;

import java.util.List;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {
	
	public abstract List<Medicamento> listaMedicamento();
	public abstract List<Medicamento> listadoPorLaboratorio(String laboratorio);
	public abstract List<Medicamento> listadoPorNombre(String nombre);
	public abstract List<Medicamento> listadoPorIdMedicamento(int id);

}
