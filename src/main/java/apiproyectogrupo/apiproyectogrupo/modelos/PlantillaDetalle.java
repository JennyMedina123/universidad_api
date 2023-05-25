package apiproyectogrupo.apiproyectogrupo.modelos;

import jakarta.persistence.*;
@Entity // se coloca en el foco para importar la PlantillaDetalle que lo 
//identifica como una entidad
@Table(name = "Plantilla_Detalle")
// Se colocan la clase con sus columnas
public class PlantillaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_plantilla_detalle")
    private long idPlantilla; 
/*El @ManyToOne en java esta diciendo que la relacion es de muchos a muchos 
y con el @JoinColumn se hace la relacion luego vamos a probar y a revisar en sql 
el diagrama*/
   @ManyToOne
   @JoinColumn(name = "id_plantilla", referencedColumnName = "id_plantilla")
   private PlantillaNota idplantilla;

/*El @ManyToOne en java esta diciendo que la relacion es de muchos a muchos 
para relacionarlo con Grupo se debe coger el encabezado desde plantillaNota*/
    @ManyToOne
    @JoinColumn(name = "id_grupo", referencedColumnName = "id_grupo")
    private Grupo grupo;

   @Column(name = "nota", length = 10)
   private String nota;

    public long getIdPlantillaDetalle() {
        return idPlantilla;
    }

    public PlantillaNota getid_plantilla() {
        return idplantilla;
    }

    public Grupo grupo() {
        return grupo;
    }

    public String getnota() {
        return nota;
    }
    public void setIdPlantillaDetalle(long IdPlantillaDetalle) {
        this.idPlantilla = IdPlantillaDetalle;
    }

    public void setIdPlantillaNota(PlantillaNota IdPlantillaNota) {
        this.idplantilla = IdPlantillaNota;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
}
