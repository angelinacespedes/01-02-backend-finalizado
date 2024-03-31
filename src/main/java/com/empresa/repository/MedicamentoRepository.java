package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {
	
	public List<Medicamento> findByLaboratorioLike(String laboratorio);  //busqueda ppr lab
	public List<Medicamento> findByNombreLike(String nombre); //por nombre 
	public List<Medicamento> findByIdMedicamento(int id); // por id

}
