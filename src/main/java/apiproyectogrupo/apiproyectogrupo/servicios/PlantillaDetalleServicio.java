package apiproyectogrupo.apiproyectogrupo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apiproyectogrupo.apiproyectogrupo.interfaces.IPlantillaDetalleServicio;
import apiproyectogrupo.apiproyectogrupo.modelos.PlantillaDetalle;
import apiproyectogrupo.apiproyectogrupo.repositorios.PlantillaDetalleRepositorio;

@Service

public class PlantillaDetalleServicio implements IPlantillaDetalleServicio{

    @Autowired
    PlantillaDetalleRepositorio repositorio;

    @Override
    public List<PlantillaDetalle> listar() {
        return repositorio.findAll();
    }

    @Override
    public PlantillaDetalle obtener(Long id) {
        var PlantillaDetalle = repositorio.findById(id);
        return PlantillaDetalle.isEmpty() ? null : PlantillaDetalle.get();
    }


    @Override
    public PlantillaDetalle guardar(PlantillaDetalle plantillaDetalle) {
        return repositorio.save(plantillaDetalle);
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
