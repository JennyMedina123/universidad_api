package apiproyectogrupo.apiproyectogrupo.controladores;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apiproyectogrupo.apiproyectogrupo.interfaces.IPlantillaNotaServicio;
import apiproyectogrupo.apiproyectogrupo.modelos.PlantillaNota;

@RestController
@RequestMapping("/plantillanota")
public class PlantillaNotaControlador {

    @Autowired //Crea la instancia del servicio 
    private IPlantillaNotaServicio servicio;
    
    @GetMapping("/listar")
    public List<PlantillaNota> listar() {
        return servicio.listar();
    }

    
    @GetMapping(value = "/listar/{id}", produces = "application/json")
    public PlantillaNota obtener(@PathVariable long id) {
        return servicio.obtener(id);
    }
}


