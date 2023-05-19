package apiproyectogrupo.apiproyectogrupo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import apiproyectogrupo.apiproyectogrupo.modelos.PlantillaNota;

@Repository
public interface PlantillaNotaRepositorio extends JpaRepository<PlantillaNota, Long>{
    
}
