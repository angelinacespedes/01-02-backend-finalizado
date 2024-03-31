package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/url/medicamento")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoService serviceMed;
	
	@GetMapping
	public List<Medicamento> listaMedicamento(){ 
		List<Medicamento> lstSalida = serviceMed.listaMedicamento();
		return lstSalida;
	}
	
	@GetMapping("/porLaboratorio/{laboratorio}") 
	public List<Medicamento> listaLaboratorio(@PathVariable("laboratorio") String laboratorio){
		List<Medicamento> lstSalida = serviceMed.listadoPorLaboratorio(laboratorio + "%");
		return lstSalida;
	}
	
	@GetMapping("/porNombre/{nombre}")
	public List<Medicamento> listaNombreMedicamento(@PathVariable("nombre") String nombre){
		List<Medicamento> lstSalida = serviceMed.listadoPorNombre(nombre + "%");
		return lstSalida;
	}
	
	@GetMapping("/porId/{idMedicamento}")
	public List<Medicamento> listadoPorId(@PathVariable("idMedicamento") int id){
		List<Medicamento> lstSalida = serviceMed.listadoPorIdMedicamento(id);
		return lstSalida;
	}

}
