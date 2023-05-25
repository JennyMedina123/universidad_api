package apiproyectogrupo.apiproyectogrupo.interfaces;

import java.util.List;
//Importa la clase modelo que se va a usar aquí
import apiproyectogrupo.apiproyectogrupo.modelos.Grupo;

public interface IGrupoServicio {
    public List<Grupo> listar();

    public Grupo obtener(Long idgrupo);

    public Grupo guardar(Grupo grupo);

    public boolean eliminar(Long idgrupo);
}

