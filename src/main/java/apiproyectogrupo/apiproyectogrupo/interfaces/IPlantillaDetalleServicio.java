package apiproyectogrupo.apiproyectogrupo.interfaces;


import java.util.List;
//Importa la clase modelo que se va a usar aquí
import apiproyectogrupo.apiproyectogrupo.modelos.PlantillaDetalle;

public interface IPlantillaDetalleServicio {
    public List<PlantillaDetalle> listar();

    public PlantillaDetalle obtener(Long idPlantilla);

    public PlantillaDetalle guardar(PlantillaDetalle plantilladetalle);

    public boolean eliminar(Long idPlantilla);
}
