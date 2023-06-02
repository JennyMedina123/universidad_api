package apiproyectogrupo.apiproyectogrupo.interfaces;

import java.util.List;
//Importa la clase modelo que se va a usar aquí
import apiproyectogrupo.apiproyectogrupo.modelos.Alumno;

public interface IAlumnoServicio {
    public List<Alumno> listar();

    public Alumno obtener(Long idAlumno);

    public Alumno guardar(Alumno alumno);

    public boolean eliminar(Long idAlumno);

}
