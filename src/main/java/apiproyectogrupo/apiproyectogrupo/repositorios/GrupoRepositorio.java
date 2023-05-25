package apiproyectogrupo.apiproyectogrupo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import apiproyectogrupo.apiproyectogrupo.modelos.Grupo;

@Repository
public interface GrupoRepositorio 
extends JpaRepository<Grupo, Long>{
    
}
