package apiproyectogrupo.apiproyectogrupo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
// import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apiproyectogrupo.apiproyectogrupo.modelos.Alumno;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno, Long>{
    // @Modifying
    // @Query("UPDATE alumnos a SET fecha_nacimiento = ?1, nombre = ?2, telefono = ?3 WHERE a.num_matricula = ?4")
    // int setAlumnoInfoById(String fechaNacimiento, String nombre, String telefono, Long id);
}
