package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {
	
	public List<Medicamento> findByLaboratorioLike(String laboratorio); //BÚSQUEDA POR LABORATORIO
	public List<Medicamento> findByNombreLike(String nombre); // BÚSQUEDA POR NOMBRE
	public List<Medicamento> findByIdMedicamento(int id); // BÚSQUEDA POR ID - CÓDIGO DEL MEDICAMENTO

}
