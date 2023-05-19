package apiproyectogrupo.apiproyectogrupo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apiproyectogrupo.apiproyectogrupo.interfaces.IPlantillaNotaServicio;
import apiproyectogrupo.apiproyectogrupo.modelos.PlantillaNota;
import apiproyectogrupo.apiproyectogrupo.repositorios.PlantillaNotaRepositorio;

@Service

public class PlantillaNotaServicio implements IPlantillaNotaServicio{

    @Autowired
    PlantillaNotaRepositorio repositorio;

    @Override
    public List<PlantillaNota> listar() {
        return repositorio.findAll();
    }

    @Override
    public PlantillaNota obtener(Long id) {
        var plantillaNota = repositorio.findById(id);
        return plantillaNota.isEmpty() ? null : plantillaNota.get();
    }


    @Override
    public PlantillaNota guardar(PlantillaNota plantillaNota) {
        return repositorio.save(plantillaNota);
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