package apiproyectogrupo.apiproyectogrupo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import apiproyectogrupo.apiproyectogrupo.modelos.PlantillaDetalle;

@Repository
public interface PlantillaDetalleRepositorio 
extends JpaRepository<PlantillaDetalle, Long>{
    
}
