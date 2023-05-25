package apiproyectogrupo.apiproyectogrupo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apiproyectogrupo.apiproyectogrupo.interfaces.IGrupoServicio;
import apiproyectogrupo.apiproyectogrupo.modelos.Grupo;
import apiproyectogrupo.apiproyectogrupo.repositorios.GrupoRepositorio;

@Service

public class GrupoServicio implements IGrupoServicio{

    @Autowired
    GrupoRepositorio repositorio;

    @Override
    public List<Grupo> listar() {
        return repositorio.findAll();
    }

    @Override
    public Grupo obtener(Long id) {
        var Grupo = repositorio.findById(id);
        return Grupo.isEmpty() ? null : Grupo.get();
    }


    @Override
    public Grupo guardar(Grupo grupo) {
        return repositorio.save(grupo);
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

