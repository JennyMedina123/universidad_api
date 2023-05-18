package apiproyectogrupo.apiproyectogrupo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apiproyectogrupo.apiproyectogrupo.interfaces.IAlumnoServicio;
import apiproyectogrupo.apiproyectogrupo.modelos.Alumno;
import apiproyectogrupo.apiproyectogrupo.repositorios.AlumnoRepositorio;

@Service

public class AlumnoServicio implements IAlumnoServicio{

    @Autowired
    AlumnoRepositorio repositorio;

    @Override
    public List<Alumno> listar() {
        return repositorio.findAll();
    }

    @Override
    public Alumno obtener(Long id) {
        var alumno = repositorio.findById(id);
        return alumno.isEmpty() ? null : alumno.get();
    }


    @Override
    public Alumno guardar(Alumno alumno) {
        return repositorio.save(alumno);
    }

    @Override
    public boolean eliminar(Long id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}