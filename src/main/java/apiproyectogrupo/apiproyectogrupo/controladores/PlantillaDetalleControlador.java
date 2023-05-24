package apiproyectogrupo.apiproyectogrupo.controladores;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apiproyectogrupo.apiproyectogrupo.interfaces.IPlantillaDetalleServicio;
import apiproyectogrupo.apiproyectogrupo.modelos.PlantillaDetalle;

@RestController
@RequestMapping("/plantilladetalle")
public class PlantillaDetalleControlador {

    @Autowired //Crea la instancia del servicio 
    private IPlantillaDetalleServicio servicio;
    
    @GetMapping("/listar")
    public List<PlantillaDetalle> listar() {
        return servicio.listar();
    }

    
    @GetMapping(value = "/listar/{id}", produces = "application/json")
    public PlantillaDetalle obtener(@PathVariable long id) {
        return servicio.obtener(id);
    }
}


