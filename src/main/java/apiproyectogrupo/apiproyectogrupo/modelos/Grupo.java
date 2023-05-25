package apiproyectogrupo.apiproyectogrupo.modelos;

import jakarta.persistence.*;
@Entity // se coloca en el foco para importar la Grupo que lo 
//identifica como una entidad
@Table(name = "Grupo")
// Se colocan la clase con sus columnas
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_grupo")
    private long idGrupo; 

   @Column(name = "id_profesor", length = 10)
   private String idprofesor;

   @Column(name = "asignatura", length = 20)
   private String asignatura;

    public long getIdGrupo() {
        return idGrupo;
    }


    public String getid_profesor() {
        return idprofesor;
    }

    public String getasignatura() {
        return asignatura;
    }
    public void setIdGrupo(long IdGrupo) {
        this.idGrupo = IdGrupo;
    }

    public void setid_profesor(String idprofesor) {
        this.idprofesor = idprofesor;
    }

    public void setasignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
}
