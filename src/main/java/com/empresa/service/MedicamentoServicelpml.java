package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServicelpml implements MedicamentoService {
	
	@Autowired
	private MedicamentoRepository mr;

	@Override
	public List<Medicamento> listaMedicamento() {
		return mr.findAll();
	}

	@Override
	public List<Medicamento> listadoPorLaboratorio(String laboratorio) {
		return mr.findByLaboratorioLike(laboratorio);
	}

	@Override
	public List<Medicamento> listadoPorNombre(String nombre) {
		return mr.findByNombreLike(nombre);
	}

	@Override
	public List<Medicamento> listadoPorIdMedicamento(int id) {
		return mr.findByIdMedicamento(id);
	}

}
