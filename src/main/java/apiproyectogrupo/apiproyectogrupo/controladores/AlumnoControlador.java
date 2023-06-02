package apiproyectogrupo.apiproyectogrupo.controladores;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import apiproyectogrupo.apiproyectogrupo.interfaces.IAlumnoServicio;
import apiproyectogrupo.apiproyectogrupo.modelos.Alumno;

@RestController
@RequestMapping("/alumnos")
public class AlumnoControlador {

    @Autowired //Crea la instancia del servicio 
    private IAlumnoServicio servicio;
    
    @GetMapping("/listar")
    public List<Alumno> listar() {
        return servicio.listar();
    }

    
    @GetMapping(value = "/listar/{id}", produces = "application/json")
    public Alumno obtener(@PathVariable long id) {
        return servicio.obtener(id);
    }

    @PostMapping(value = "/", produces = "application/json")
    public Alumno guardar(@RequestBody  Alumno body) {
        return servicio.guardar(body);
    }

    @DeleteMapping(value = "/{id}", produces = "application/json")
    public Boolean eliminar(@PathVariable long id) {
        return servicio.eliminar(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Alumno actualizar(@RequestBody  Alumno alumno) {
        if(servicio.obtener(alumno.getIdAlumno()) != null){
            return servicio.guardar(alumno);
        } else {
            return null;
        }
    }
}

