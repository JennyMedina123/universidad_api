package apiproyectogrupo.apiproyectogrupo.interfaces;

import java.util.List;
//Importa la clase modelo que se va a usar aquí
import apiproyectogrupo.apiproyectogrupo.modelos.PlantillaNota;

public interface IPlantillaNotaServicio {
    public List<PlantillaNota> listar();

    public PlantillaNota obtener(Long idPlantilla);

    public PlantillaNota guardar(PlantillaNota plantillaNota);

    public boolean eliminar(Long idPlantilla);
}
