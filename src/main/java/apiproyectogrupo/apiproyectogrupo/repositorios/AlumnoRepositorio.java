package apiproyectogrupo.apiproyectogrupo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import apiproyectogrupo.apiproyectogrupo.modelos.Alumno;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno, Long>{
    
}
