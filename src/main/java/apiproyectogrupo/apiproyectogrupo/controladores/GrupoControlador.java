package apiproyectogrupo.apiproyectogrupo.controladores;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import apiproyectogrupo.apiproyectogrupo.interfaces.IGrupoServicio;
import apiproyectogrupo.apiproyectogrupo.modelos.Grupo;

@RestController
@RequestMapping("/grupo")
public class GrupoControlador {

    @Autowired //Crea la instancia del servicio 
    private IGrupoServicio servicio;
    
    @GetMapping("/listar")
    public List<Grupo> listar() {
        return servicio.listar();
    }

    
    @GetMapping(value = "/listar/{id}", produces = "application/json")
    public Grupo obtener(@PathVariable long id) {
        return servicio.obtener(id);
    }
}



